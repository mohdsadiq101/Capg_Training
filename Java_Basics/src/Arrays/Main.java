package Arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a1 = new int[size];
        int[] a2 = new int[size];
        for (int i = 0; i < size; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        int i;
        for (i = 0; i < size; i++) {
            if (a1[i] != a2[i]) {
                System.out.println(false);
                break;
            }
        }
        if (i == size)
            System.out.println(true);
    }
}
