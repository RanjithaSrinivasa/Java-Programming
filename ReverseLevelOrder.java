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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //queue to keep track of parent and children(fifo)
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //linkedlist cause it has addFirst method
        LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
        TreeNode curr = root;
        
        if(root==null){
            return list;
        }
        
        //add the root first to populate the queue
        queue.add(curr);
        while(!queue.isEmpty()){
            //each levels size
            int size = queue.size();
            List<Integer> small = new ArrayList<Integer>();
            //iterate until all the elements in a given level is processed
            while(size!=0){
                //remove the elem from queue and check if it has right and left children
                TreeNode node = queue.remove();
                small.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }
            //to get the elements in reverse order addFirst method
            list.addFirst(small);
        }
        return list;
    }
}