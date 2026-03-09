package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(validP(s));
    }

    static boolean validP(String s) {
        if (s.charAt(0)==')')
            return false;

        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '('){
                st.push(ch);
            } else {
                if (st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
