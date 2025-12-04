class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int [] flowers= new int[flowerbed.length+2];
        for(int i=0;i<flowerbed.length;i++){
            flowers[i+1]=flowerbed[i];
        }
        
        for(int i=1;i<flowers.length-1;i++){
            if(flowers[i-1]==0 && flowers[i]==0 && flowers[i+1]==0){
                flowers[i]=1;
                n--;
            }
        }
        return n<=0;

        
    }
}