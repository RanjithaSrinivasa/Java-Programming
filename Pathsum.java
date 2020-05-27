/**
 * Definition for a binary tree node. */
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
    public boolean hasPathSum(TreeNode root, int sum) {
        int total = 0;
        if(root == null) {
            return false;
        }
        else {
            total = root.val;
            if(total == sum) {
                return true;
            }
            else {
                hasPathSum(root.left, sum - root.val);
                hasPathSum(root.right, sum - root.val);
            }
        }
        return true;
    }
}