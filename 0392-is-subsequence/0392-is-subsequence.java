class Solution {
    public boolean isSubsequence(String s, String t) {
        // int sCounter=0;
        // int tCounter=0;


        // while(sCounter<s.length() && tCounter<t.length()){
        //     if(s.charAt(sCounter)==t.charAt(tCounter)){
        //         sCounter++;
        //     }
        //     tCounter++;
        // }
        // return sCounter==s.length();

        int sp=0;
        int tp=0;

        int slen=s.length();
        int tlen=t.length();

        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();

        if(slen<1) return true;

        while(sp<tlen){
            if(tt[sp]==ss[tp]){
                tp++;
            }
            sp++;

            if(tp==slen) return true;
        } 
        return false;  

    }
}