//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            String Character = "Character";
            if (Character.equals(s) && ans == 2) {
                ans = 1;
            }
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        if(str.equals("Character")){
            return Character.BYTES;
        }
        else if(str.equals("Integer")){
            return Integer.BYTES;
        }
        else if(str.equals("Long")){
            return Long.BYTES;
        }
        else if(str.equals("Float")){
            return Float.BYTES;
        }
        else if(str.equals("Double")){
            return Double.BYTES;
        }
        else return -1;
    }
}