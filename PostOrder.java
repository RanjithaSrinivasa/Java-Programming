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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        //push the first elem
        if(root!=null){
            stack.push(root);
        }
        while(!stack.isEmpty()){
            //pop the top elem, in first iter root is popped first
            TreeNode temp = stack.pop();
            //addFirst() for linkedlist only but this method is not there for list
            list.addFirst(temp.val);
            //add left
            if(temp.left!=null){
                stack.push(temp.left);
            }
            //add right
            if(temp.right!=null){
                stack.push(temp.right);
            }
        }
        return list;
        
    }
}