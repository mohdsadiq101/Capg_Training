package String;

public class ReplaceChar {
    public static void main(String[] args) {
        String str = "Program";
        char c = 'r';
        char ch = 'l';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                sb.append(ch);
            else
                sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}