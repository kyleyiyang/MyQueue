class MyQueue {
    Stack<Integer> store;
    Stack<Integer> temp;
    /** Initialize your data structure here. */
    public MyQueue() {
        store = new Stack<Integer>();
        temp = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        store.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (temp.empty()) {
            while(!store.empty()) {
                temp.push(store.pop());
            }
        }
        
        return temp.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if (temp.empty()) {
            while(!store.empty()) {
                temp.push(store.pop());
            }
        }
        
        return temp.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return temp.empty() && store.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
