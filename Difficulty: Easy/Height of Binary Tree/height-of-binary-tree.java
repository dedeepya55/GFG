/*
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
    // Function to find the height of a binary tree.
    int Height(Node node){
        if(node==null){
            return -1;
        }
        int lH=Height(node.left);
        int rH=Height(node.right);
        
        return Math.max(lH,rH)+1;
    }
    int height(Node node) {
        // code here
        return Height(node);
    }
}