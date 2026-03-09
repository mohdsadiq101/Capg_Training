package String;

import java.util.HashMap;
import java.util.Scanner;

public class HighestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 0;
        int[] freq = new int[256];
        for (char ch : str.toCharArray()){
            freq[ch]++;
            if(max < freq[ch])
                max = freq[ch];
        }
        System.out.println(max);
    }
}
