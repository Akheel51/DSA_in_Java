class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=Integer.MIN_VALUE;
        for(int[] ints:accounts){
            int sum=0;
            for(int anInt:ints){
                sum+=anInt;
            }
            if(sum> max_wealth){
                max_wealth=sum;
            }
        }
       return max_wealth; 
    }
}