package String;

import java.util.HashSet;
import java.util.Scanner;

public class CompressRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
//        HashSet<Character> set = new HashSet<>();
//        for (char ch : str.toCharArray()){
//            set.add(ch);
//            if (set.contains(ch))
//                sb.append();
//        }

        for (int i = str.length()-1; i >= 0 ; i--) {
            if (str.charAt(i) != str.charAt(i-1))
                sb.append(str.charAt(i));
        }
    }
}
