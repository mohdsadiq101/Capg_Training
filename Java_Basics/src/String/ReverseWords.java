package String;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is best";
        String w = "";
        String n = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' '){
                n = n + w + " ";
                w = "";
            } else {
                w = str.charAt(i) + w;
            }
        }
        n = n + w;
        System.out.println(n);
    }
}
