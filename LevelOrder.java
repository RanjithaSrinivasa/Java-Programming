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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null)
            return list;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size(); 
            List<Integer> smallist = new ArrayList<Integer>();
            for(int i=0; i< size ; i++){
                
                TreeNode curr = queue.remove();
 
                smallist.add(curr.val);
                
                if(curr.left!=null)   
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
                
            }
            list.add(smallist);
            
        }
        return list; 
    }
}