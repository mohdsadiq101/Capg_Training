package String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length())
                max = arr[i].length();
        }
        System.out.println(max);



//        int maxlen = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ' || i != str.length()-1){
//                c++;
//            } else {
//                maxlen = Math.max(maxlen,c);
//            }
//        }
//        System.out.println(maxlen);
    }
}
