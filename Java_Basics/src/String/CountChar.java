package String;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                c++;
        }
        System.out.println(c);
    }
}
