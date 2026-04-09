class MinStack {

    Stack<Integer> stack = null;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int min = stack.peek();
        for (int val : stack) {
            min = Math.min(val, min);
        }
        return min;
    }
}
