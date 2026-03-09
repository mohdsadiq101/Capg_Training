package String;

import java.util.Scanner;

public class LowerCaseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            int chr = str.charAt(i);
            if (chr >= 97 && chr <= 123){ // >= 'a' && <= 'z'
                System.out.print(str.charAt(i));
                c++;
            }
        }
        System.out.println();
        System.out.println(c);
    }
}
