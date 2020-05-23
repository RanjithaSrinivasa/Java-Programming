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
    public boolean compare(TreeNode lsubtree, TreeNode rsubtree) {
        if((lsubtree == null) || (rsubtree == null)) {
            return true;
        } else {
           if  (lsubtree.left.val == rsubtree.right.val) {
                if (lsubtree.right.val == rsubtree.left.val){
                    compare (lsubtree.left, rsubtree.right);
                    compare(lsubtree.right, rsubtree.left);
                }
           }
           else {
              return false;
           }
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
     boolean flag = true;
     if(root != null) {
         //System.out.println("left val is" + root.left.val);
         TreeNode lt = root.left;
         TreeNode rt = root.right;
         flag = compare(lt,rt);         
     } 
    return flag;
    }
}