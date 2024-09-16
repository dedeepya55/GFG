//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int b = Integer.parseInt(in.readLine());
            String N = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.decimalEquivalent(N, b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int decimalEquivalent(String N, int b)
    {
        // code here
         int r = 0;
        int length = N.length();
        
        for (int i = length - 1; i >= 0; i--) {
            char c = N.charAt(i);
            int d;
            if (c >= '0' && c <= '9') {
                d = c - '0';  
            } else if (c >= 'A' && c <= 'F') {
                d = c - 'A' + 10;
            } else {
                return -1;  
            }
            
            if (d >= b) {
                return -1;
            }
            
            r += d * Math.pow(b, length - 1 - i);  
        }
        
        return r;
    }
}