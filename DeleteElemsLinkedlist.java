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
    public ListNode removeElements(ListNode head, int val) {
            ListNode curr = head;
            ListNode prev = null;
            while (curr != null && curr.val == val) {
                    head = curr.next;
                    curr = head;
            }
            while(curr != null) {
                while(curr != null && curr.val != val) {
                    prev = curr;
                    curr = curr.next;
                }
                if (curr == null) {
                    return head;
                }
                prev.next = curr.next;
                curr = prev.next;
            }
        return head;
    }
}