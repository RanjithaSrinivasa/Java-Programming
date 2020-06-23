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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        if(head == null || head.next == null){
            return head;
        }
        
        while(curr != null && curr.next != null){
            while(curr != null && curr.next != null && curr.val == curr.next.val) {
                 curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;        
    }
}