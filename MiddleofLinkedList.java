/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new LinkedList<ListNode>();
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            list.add(curr);
            curr = curr.next;
        }
        

        return list.get(count/2);
        
    }
}