class Solution {
    public int findNumbers(int[] nums) {
        int count=0;

        for(int ele:nums){
            if(solve(ele)){
                count++;
            }
        }
        return count;
    }
    static boolean solve(int ele){
        int c=0; 
         while(ele>0){
            ele=ele/10;
            c++;
        }
        return c%2==0;
    }
}