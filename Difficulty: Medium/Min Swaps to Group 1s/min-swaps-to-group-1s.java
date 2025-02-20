//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length]; // Declared as int[]

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.minSwaps(arr));
        }
        scanner.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int minSwaps(int[] arr) {
        // Complete the function
        int oc=0,zc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                oc++;
            }
        }
        int r=0;
        for(int i=0;i<oc;i++){
            if(arr[i]==1){
                r++;
            }
        }
        if(oc==0){
            return -1;
        }
        else{
         int ans=Integer.MIN_VALUE;
         ans=Math.max(ans,r);
        for(int i=oc;i<arr.length;i++){
            if(arr[i]==1){
                r++;
                if(arr[i-oc]==1){
                    r--;
                }
            }
            else{
                if(arr[i-oc]==1){
                    r--;
                }
            }
            ans=Math.max(ans,r);
        }
       int k=Math.abs(ans-oc);
        return k;
        }
        
    }
}
