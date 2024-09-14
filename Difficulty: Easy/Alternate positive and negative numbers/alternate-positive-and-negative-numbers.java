//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i:arr){
            if(i<0){
                b.add(i);
            }
            else{
                a.add(i);
            }
        }
        arr.clear();
        int i=0,j=0;
        while(i<a.size() && j<b.size()){
            arr.add(a.get(i++));
            arr.add(b.get(j++));
        }
         while(i<a.size()){
            arr.add(a.get(i++));
        }
         while(j<b.size()){
            arr.add(b.get(j++));
        }
    }
}