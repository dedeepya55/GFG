//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> st=new Stack<>();
        int k=0;
        int l=-1;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                st.push(i);
            }
            else{
                if(st.isEmpty())
                {
                    l=i;
                }
                else{
                    st.pop();
                    if(st.isEmpty()){
                       k=Math.max(k,i-l); 
                    }
                    else{
                        k=Math.max(k,i-st.peek());
                    }
                }
            }
        }
        return k;
    }
}