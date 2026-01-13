class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int larg=-1;
        int slarg=-1;
        
        for(int ele: arr){
            if(ele>larg) larg=ele;
        }
        
        for(int ele: arr){
            if(ele>slarg && ele<larg) slarg=ele;
        }
        
        return slarg;
    }
}