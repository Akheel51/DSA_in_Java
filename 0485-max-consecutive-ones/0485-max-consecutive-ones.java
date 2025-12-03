class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
            int curr_count=0, maxlen=0;

            for(int ele:nums){
                if(ele==1){
                    curr_count++;
                    maxlen=Math.max(maxlen,curr_count);
                }else{
                    curr_count=0;
                }
            }
            return maxlen;
    }
}