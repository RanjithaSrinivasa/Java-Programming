class Queue {
	class Node {
		int data;
		Node next;
		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	Node head;
	Node tail;

    public Boolean isEmpty() {
    	if(head == null) {
    		return true;
    	} else
    	return false;

    }

	public void add(int x){
		Node item = new Node(x);
		if(tail != null){
			tail.next = item;
		} 
		tail = item;
		if(head == null) {
			head = item;
		}
	}

	public int poll() {
		int data = head.data;
		if(head == null){
			tail = null;
		} else {
			head = head.next;
		}
		return data;
	}

	public int top(){
		return head.data;
	}

	public int size() {
		Node curr = head;
		int count = 0
		;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	public void clear() {
		head = null;
		tail = null;
	}

	public static void main(String [] args){
		Queue q = new Queue();

		System.out.println("empty queue - " + q.isEmpty());

		q.add(1);
		q.add(2);

		System.out.println("top element is " + q.top());

		System.out.println("size of queue is " + q.size());

		q.poll();

		System.out.println("empty queue - " + q.isEmpty());

		System.out.println("size of queue is " + q.size());

		q.clear();

		System.out.println("size of queue is " + q.size());

	}

}