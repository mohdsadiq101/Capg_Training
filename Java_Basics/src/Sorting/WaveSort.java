package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class WaveSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i+=2){
            if (a[i] < a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
