import java.util.*;
class MyStack {

    Queue<Integer> q;
    
    public MyStack() {
        q = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q.add(x);
        int i = 0;
        while(i < q.size()-1){
            q.add(q.remove());
            i++;
        }
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.element();
    }
    
    public boolean empty() {
        return q.isEmpty();
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