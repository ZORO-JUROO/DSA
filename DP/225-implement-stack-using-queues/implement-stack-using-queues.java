class MyStack {
    ArrayList<Integer> arr=new ArrayList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        arr.add(x);
    }
    
    public int pop() {
       return arr.remove(arr.size()-1);
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public boolean empty() {
        return arr.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */