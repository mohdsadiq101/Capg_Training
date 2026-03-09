package String;

public class InitialsUC {
    public static void main(String[] args) {
        String str = "messi is better than ronaldo";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == 0 || c[i-1] == ' '){
                c[i] = (char) (c[i] - 32);
            }
        }
        System.out.println(new String(c));
    }
}
