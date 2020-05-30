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
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
       if (l1 == null) return l2;
       if (l2 == null) return l1;
        
       if (l1.val <= l2.val) {
         l1.next = mergeTwoLists(l1.next, l2); 
         return l1;
       } else {
           l2.next = mergeTwoLists(l1, l2.next);
           return l2;
       }
    }
}
       /* 
       ListNode curr1 = l1;
       ListNode curr2 = l1;
       ListNode newlist = new ListNode();
       ListNode head = null;
       ListNode curr = head;
        
      //when both the list have elements
      while(curr1 != null && curr2 != null) {
      if(curr1.val >= curr2.val) {
        ListNode mer = new ListNode();
        mer.val = curr2.val;
        mer.next = null;
        if(head == null) {
            newlist = mer;
            head = newlist;
            curr = head;
        } else {
         curr.next = mer;   
        }        
      } else {
        ListNode mer = new ListNode();
        mer.val = curr1.val;
        mer.next = null;
        if(newlist == null) {
            newlist = mer;
            head = newlist;
            curr = head;
        } else {
            curr.next = mer;   
        }
      }
      curr1 = curr1.next;
      curr2 = curr2.next;
      }
        
      //when list 1 runs out of elements
      if(curr1 == null && curr2 != null) {
          while(curr2 != null) {
            newlist = curr2;
            curr2 = curr2.next;
          }
          newlist.next = null;
      } 
        
     // when list2 runs out of elements
      if (curr1 != null && curr2 == null) {
          while(curr2 != null) {
            newlist = curr2;
            curr2 = curr2.next;
          }
          newlist.next = null;
      }           
    return head; */