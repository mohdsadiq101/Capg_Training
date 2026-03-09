package BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binarysearch(n));
    }

    static int binarysearch(int n) {
        if (n <= 1)
            return n;

        int start = 0, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid < n)
                start = mid;
            else if (mid * mid > n)
                end = mid;
            else
                return mid;
        }
        return -1;
    }
}
