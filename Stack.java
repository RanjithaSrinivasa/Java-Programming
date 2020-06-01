
/* stack is linear data structure each element is 
connected to it's next and can be traversed one after other */

public class Stack {
	int arr[];
	int top;
	int capacity;

	Stack(int size){
		arr  = new int[size];
		this.capacity = size;
		this.top = -1;
	}

	public void push(int elem) {
		if(isFull()) {
			System.out.println("Stack is full");
			System.exit(1);
		} else {
			arr[++top] = elem;
		}
	}

	public int pop(){
		if(isEmpty()) {
			System.out.println("stack is empty");
			System.exit(1);
		} 
		return arr[top--];
	}

	public Boolean isFull(){
		if(top+1 == capacity) {
			System.out.println("Full Stack");
			return true;
		} else return false;
	}

	public Boolean isEmpty() {
		if(top == 0) {
			return true;
		} else return false;
	}

    public int size() {
    	return top + 1;
    }
	public int peek(){
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		} 
		return arr[top];

	}



	public static void main(String [] args) {
		Stack s = new Stack(4);

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		int w = s.size();
		System.out.println("size is " + w);

		s.isFull();

	    int e = s.peek();
	    System.out.println("top element is " + e);

	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();

	    s.isEmpty();
	}
}