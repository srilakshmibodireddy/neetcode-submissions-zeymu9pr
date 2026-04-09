class MinStack {

    Stack<Integer> stack = null;
    Stack<Integer> minStack = null;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);

        }
    }
    
    public void pop() {
        int remove = stack.pop();
        int currMin = minStack.peek();
        if (currMin == remove) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
