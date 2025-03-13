//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input (arr)
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] =
                    Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input (dep)
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] dep = new int[m];
            for (int i = 0; i < m; i++) {
                dep[i] =
                    Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution obj = new Solution();
            System.out.println(obj.findPlatform(arr, dep));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        // List<List<Integer>> l=new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     List<Integer> pa=new ArrayList<>();
        //     pa.add(arr[i]);
        //     pa.add(dep[i]);
        //     l.add(pa);
        // }
        // Collections.sort(l,(a,b)->Integer.compare(a.get(1),b.get(1)));
        // int fI=l.get(0).get(1);
        // int cnt=1;
        // int max=Integer.MIN_VALUE;
        // for(int i=1;i<arr.length;i++){
        //     if(l.get(i).get(0)<fI){
        //         cnt++;
        //         System.out.println(l.get(i).get(0)+" "+cnt);
        //     }
        //     else{
        //         max=Math.max(cnt,max);
        //         cnt=1;
        //     }
        //     fI=l.get(i).get(1);
        // }
        // max=Math.max(max,cnt);
        // if(max==Integer.MIN_VALUE) return 1;
        // return max;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int pN=0,mP=0;
        int n=arr.length;
        int i=0,j=0;
        while(i<n ){
            if(arr[i]<=dep[j]){
                pN++;
                i++;
            }
            else{
                pN--;
                j++;
            }
            mP=Math.max(mP,pN);
        }
        
        return mP;
    }
}
