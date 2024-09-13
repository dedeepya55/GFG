//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        Map<Integer,Integer> m=new HashMap<>();
        Set<Integer> s=new HashSet();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
         for (int i : s) {
            m.put(i, 0);
        }
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.get(arr[i]) + 1);
        }
        int c=arr.length/2;
        for(Map.Entry<Integer,Integer> i:m.entrySet()){
            if(i.getValue()>c){
                return i.getKey();
            }
        }
        return -1;
    }
}