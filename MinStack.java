class MinStack {

    //Stack class from collections
    Stack<Integer> stack;
    Stack<Integer> minstack;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        minstack = new Stack();
    }
    
    public void push(int x) {
        if(minstack.isEmpty() || x <= minstack.peek()) {
            minstack.push(x);
        }
        /* do not have to worry about base conditions as 
        stack class implicity takes care of it */
        stack.push(x);
    }
    
    public void pop() {
        if(stack.peek().equals(minstack.peek())) {
            minstack.pop();
        }
       stack.pop(); 
    }
    
    public int top() {
      return stack.peek();  
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */