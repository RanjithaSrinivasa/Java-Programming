/**
 * Definition for a binary tree node.
 */
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public int height(TreeNode root) {
           if (root == null) {
               return 0;
           } else {
           int left = height(root.left);
           int right = height(root.right);
           if(height(root.left) > height(root.right)) {
               return (1 + height(root.left));
           } else {
               return (1+ height(root.right));
           }
           }
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        int max = 0;
        if(root != null) {
            height(root);
        }
        return 0; 
    }
}