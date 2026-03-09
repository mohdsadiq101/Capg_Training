package String;

import java.util.Arrays;
import java.util.Scanner;

public class InsertinSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {101,102,110,120,130};
        int elem = 107;
        int[] narr = new int[arr.length+1];
        int i = 0;
        while (i < arr.length && arr[i] < elem){
            narr[i] = arr[i];
            i++;
        }
        narr[i] = elem;
        while (i < arr.length){
            narr[i+1] = arr[i];
            i++;
        }
        System.out.println(Arrays.toString(narr));
    }
}
