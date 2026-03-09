package Arrays;

import java.util.Arrays;

public class P_29to {

    // 29. swap two given index
    static void P29(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println(Arrays.toString(arr));
    }

    // 30. reverse elements
    static void P30(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int j = arr.length-i-1;
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
        System.out.println(Arrays.toString(arr));
    }

    //31. reverse only 1st half
    static void P31(int[] arr){
        int hl = arr.length/2;
        for (int i = 0; i < hl/2; i++) {
            int j = hl - 1- i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 32. rev 2nd half
    static void P32(int[] arr){
        int i = arr.length/2;
        int j = arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 33. rev only even idx
    static void P33(int[] arr){
        int i = 0, j = arr.length - 1;
        if (j % 2 != 0)
            j--;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j-=2;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 34. rev odd idx
    static void P34(int[] arr){
        int i = 1, j = arr.length - 1;
        if (j % 2 == 0)
            j--;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j-=2;
        }
        System.out.println(Arrays.toString(arr));
    }

    //35. swap odd idx with next even idx
    static void P35(int[] arr){
        int i = 1;
        while (i < arr.length-1){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i += 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    // right shift elements by n times
    static void P36(int[] arr,int n){
        int i = arr.length-1;
        for (int j = 0; j < i - n; j++) {
            arr[i] = arr[i-1];
            i--;
        }
        for (int j = 0; j < n; j++) {
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    // right shift elements one time
    static void P42(int[] arr){
        int j = arr.length-1; // last element
        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    // right shift elements n times
    static void P43(int[] arr){
        int j = arr.length-1; // last element
        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,5,7,9,12};
        P36(arr,3);
    }
}
