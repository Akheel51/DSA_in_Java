class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=1,n=prices.length;
        int max_profit=0;
        while(right<n){
            int curr_profit=prices[right]-prices[left];
            if(prices[left]<prices[right]){
                max_profit=Integer.max(max_profit,curr_profit);
            }
            else{
                left=right;
            }
            right+=1;
        }
        return max_profit;
    }
}