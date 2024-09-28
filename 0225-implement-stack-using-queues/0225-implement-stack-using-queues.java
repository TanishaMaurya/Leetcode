class MyStack {

    Queue<Integer> q1;
       

    public MyStack() {
        q1=new LinkedList<>();
       

    }
    
    public void push(int x) {
       q1.offer(x);
    }
    
    public int pop() {
        int n=q1.size(),pop=0;
       while(n>0){
           if(n==1){
               pop=q1.poll();
               break;
           }
           q1.offer(q1.poll());
           n--;
       }
       return pop;
    }
    
    public int top() {
       int n=q1.size(),top=0;
       while(n>0){
           if(n==1){
               top=q1.peek();
           }
           q1.offer(q1.poll());
           n--;
       }
       return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
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