// User function Template for Java

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
     public static int Height(Node node){
        if(node==null){
            return -1;
        }
        int lH=Height(node.left);
        int rH=Height(node.right);
        
        return Math.max(lH,rH)+1;
    }
    public static int maxDepth(Node root) {
        // code here
        return Height(root)+1;
    }
}
