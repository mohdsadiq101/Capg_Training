package String;

import java.util.HashSet;

public class RepeatingChar {
    public static void main(String[] args) {
        String s = "MADAM";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.add(c))
                sb.append(c);
        }
        System.out.println(sb);
    }
}
