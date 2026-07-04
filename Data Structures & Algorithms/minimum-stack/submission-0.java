class MinStack {
    private ArrayList<Integer> stack;
    private int top;
    public MinStack() {
        stack = new ArrayList<>();
        top = -1;
    }
    
    public void push(int val) {
        stack.add(val);
        top++;
    }
    
    public void pop() {
        stack.remove(top);
        top--;
    }
    
    public int top() {
        return stack.get(top);
    }
    
    public int getMin() {
        int min = stack.get(0);
        for(int i=0;i<=top;i++){
            min = Math.min(min, stack.get(i));
        }
        return min;
    }
}
