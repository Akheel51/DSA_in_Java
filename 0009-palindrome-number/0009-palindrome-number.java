class Solution {
    public int rev(int n){
        long ans=0;

        while(n!=0){
            ans=ans*10+n%10;
            n/=10;
        }
        return (ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)?0:(int)ans;
    }

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int res=rev(x);
        return res==x?true:false;
        
    }
}