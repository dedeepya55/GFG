/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int diameter=0;
    public int hgh(Node root){
        if(root==null){
            return 0;
        }
        int lh=hgh(root.left);
        int rh=hgh(root.right);
        diameter=Math.max(diameter,lh+rh);
        return Math.max(lh,rh)+1;
    }
    int diameter(Node root) {
        // Your code here
        hgh(root);
        return diameter;
    }
}