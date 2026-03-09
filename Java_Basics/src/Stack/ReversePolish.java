package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("");
        evalRPN(str);
    }

    public static void evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens){
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();

                if (s.equals("+"))
                    st.push(a+b);
                else if (s.equals("-"))
                    st.push(a-b);
                else if (s.equals("*"))
                    st.push(a*b);
                else
                    st.push(a/b);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        System.out.println(st.pop());
    }
}
