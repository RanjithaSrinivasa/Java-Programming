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
                //save previous head so that new head's next points to it
                prevhead = head;
                //curr holds the new head value
                head = curr.next;
                //link between left out elements in list and the reversed list
                //this can also be curr.next = curr.next.next
                curr.next = head.next;
                //link new head and rest of list
                /*if you interchange previous step and this, we will lose the link for 
                reversed list and left elements */
                head.next = prevhead; 
            }
        }
        return head;  
    }
}