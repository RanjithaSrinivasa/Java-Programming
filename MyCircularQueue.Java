class MyCircularQueue {
    
    int[] queue;
    int front;
    int rear;
    int count;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue = new int[k];
        front = rear = -1;
        count = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull() == true) {
            return false;
        }
        
        if(isEmpty() == true) {
            front = 0;
        }
        
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        count++;
        //System.out.println("count is" + count);
        
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty() == true) {
            return false;
        } 
        //last element deletion
        if(front == rear){
            front = rear = -1;
            return true;
        }
        front = (front + 1) % queue.length;
        count--;
        System.out.println("dequeue count is" + count);
        System.out.println("elements present are");
        for(int i=0; i< queue.length; i++) {
            System.out.println(queue[i]);
        }
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty())
            return -1;
        else 
            return queue[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty())
            return -1;
        else 
            return queue[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((rear + 1) % queue.length) == front;
    }
    
    /** Checks whether the circular queue is empty or not. */
/*    public boolean isEmpty() {
        if(count == 1) {
            return true;
        } else 
            return false;
        
    } */
    
    /** Checks whether the circular queue is full or not. */
 /*   public boolean isFull() {
        if(count == queue.length) {
            return true;
        } else return false;
    } */
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */