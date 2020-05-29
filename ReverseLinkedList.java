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
    public ListNode reverseList(ListNode head) {
        if(head != null) {
            ListNode curr = head;
            ListNode prevhead = null;
            while(curr.next != null) {
                prevhead = head;
                head = curr.next;
                curr.next = head.next;
                head.next = prevhead; 
            }
        }
        return head;  
    }
}