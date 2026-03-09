package Arrays;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] + arr[j] == 10){
                    c++;
                    System.out.println(arr[i]+","+arr[j]);
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }
        System.out.println(c);
    }
}
