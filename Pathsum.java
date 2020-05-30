/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int total = 0;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        sum = sum - root.val;
        if(isLeaf(root) == true && (sum == 0) ) {
                return true;
        }
                
        boolean left = hasPathSum(root.left, sum);
        boolean right = hasPathSum(root.right, sum);
        
        return left || right;
    }     
    public boolean isLeaf(TreeNode root) {
        if(root.left == null && root.right == null) return true;
        else return false;
    }

}