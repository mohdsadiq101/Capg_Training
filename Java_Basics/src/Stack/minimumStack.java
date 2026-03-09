package Stack;

import java.util.Stack;

public class minimumStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minst = new Stack<>();
    minimumStack(){
    }

    void addValue(int val){
        st.push(val);
        if (minst.isEmpty() || val <= minst.peek())
            minst.push(val);
    }

    void removeTopValue(int val){
        if (st.peek().equals(minst.peek()))
            minst.pop();
        st.pop();
    }

    int topValue() {
        return st.isEmpty() ? -1 : st.peek(); }

    int getMinValue() {
        return minst.isEmpty() ? -1 : minst.peek(); }
}










//class MinStack {
//    Stack<Integer> s = new Stack<>(), st = new Stack<>();
//    public void push(int val) {
//        s.push(val);
//        if (st.isEmpty() || val <= st.peek()) st.push(val);
//    }
//    public void pop() {
//        if (s.peek().equals(st.peek())) st.pop();
//        s.pop();
//    }
//    public int top() { return s.isEmpty() ? -1 : s.peek(); }
//    public int getMin() { return st.isEmpty() ? -1 : st.peek(); }
//}