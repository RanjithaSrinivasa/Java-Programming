
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

	public void pop(){
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		} else {
			System.out.println("Deleted element is " + arr[top--]);
		}
	}

	public Boolean isFull(){
		if(top+1 == capacity) {
			System.out.println("Stack is full");
			return true;
		} else return false;
	}

	public Boolean isEmpty() {
		if(top == 0) {
			return true;
		} else return false;
	}

    public void size() {
    	System.out.println("Size is " + (top + 1));;
    }

	public void peek(){
		if(isEmpty()) {
			System.out.println("Stack is empty");
			System.exit(1);
		} else
		 	System.out.println("Top most element is " + arr[top]);
	}

	public void clear() {
		top = 0;
	}



	public static void main(String [] args) {
		Stack s = new Stack(4);

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

	    s.size();

		s.isFull();

	    s.peek();

	    s.clear();

	    s.peek();
/*
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();

	    s.isEmpty(); */
	}
}