class Solution {
    public boolean isSubsequence(String s, String t) {
        int sCounter=0;
        int tCounter=0;

        while(sCounter<s.length() && tCounter<t.length()){
            if(s.charAt(sCounter)==t.charAt(tCounter)){
                sCounter++;
            }
            tCounter++;
        }
        return sCounter==s.length();
    }
}