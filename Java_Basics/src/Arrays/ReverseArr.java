package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class ReverseArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length/2; i++) {
            int j = arr.length-i-1;
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }
}
