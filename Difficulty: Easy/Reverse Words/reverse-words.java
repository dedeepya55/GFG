//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
         Stack<String> s = new Stack<>();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {   
                s.add(st.toString()); 
                s.add("."); 
                st.setLength(0);  
            } else {
                st.append(str.charAt(i));  
            }
        }
        s.add(st.toString());
        st.setLength(0);
        while (!s.isEmpty()) {
            st.append(s.pop());
        }
        
        return st.toString();
        }
}