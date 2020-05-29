class Node {
    int val;
    Node next;
    
    public Node(int v) {
        this.val = v;
        this.next = null;
    }
}

class MyLinkedList {

    Node head;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
      this.head = null;          
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (head == null) {
            return -1;
        } else if (index == 0) {
            return head.val;
        } else {
            Node curr = head;
            int count = 0;
            while (curr != null) {
                if (index == count) {
                    break;
                } else {
                    count += 1;
                    curr = curr.next;
                }
            }
            if(curr == null) {
                return -1;
            } else
                return curr.val;
        }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
      Node temp = new Node(val);
      if(head == null) {
          head = temp;
      } else {
          temp.next = head;
          head = temp;
      }
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(head == null) {
           head = temp; 
        } else if(head.next == null) {
            head.next = temp;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(head != null){
            if (index == 0) {
               addAtHead(val);
            } else {
                Node temp = new Node(val);
                Node prev = null;
                Node curr = head;
                int count = 0;
                while(curr != null) {
                    if (index == count) {
                         temp.next = prev.next;
                         prev.next = temp; 
                     break;
                    } else {
                        count++;
                        prev = curr;
                        curr = curr.next;
                    }
                }
                if(count == index){
                    prev.next = temp;
                }
            }
        }else{
            if(index == 0)
                addAtHead(val);
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(head != null){
            if(index == 0){
                head = head.next;
            }else{
                Node curr = head;
                Node prev = null;
                int count = 0;
                while(curr != null){
                   if(count == index) {
                       break;
                   } else {
                       prev = curr;
                       curr = curr.next;
                       count++;
                   }
                }
                if(curr != null) {
                    prev.next = curr.next;
                }  
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */