package Arrays;

public class P_1_28 {

    // sum of all elements
    static void P1(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    // min element
    static void P2(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(min);
    }

    // max element
    static void P3(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max);
    }

    // second max
    static void P4(int[] a){
        int max = a[0], max2 = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max){
                max2 = max;
                max = a[i];
            }
        }
        System.out.println(max2);
    }

    // average value
    static void P6(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum/a.length);
    }

    // sum of even index and odd
    static void P7P8(int[] a){
        int sumeven = 0, sumodd = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0)
                sumeven += a[i];
            else
                sumodd += a[i];
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
    }

    // min value from all even index
    static void P9(int[] a){
        int max = a[0], max2 = a[1];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0){
                if (a[i] > max){
                    max2 = max;
                    max = a[i];
                }
            }
        }
        System.out.println(max2);
    }

    // max value of all even index
    static void P10(int[] a){

    }

    // avg value from all even index
    static void P11(int[] a){
        int s = 0;
        int n = a.length;
        if (n % 2 != 0)
            n += 1;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0){
                s += a[i];
            }
        }
        System.out.println(s/n);
    }

    // avg value from all odd index
    static void P12(int[] a){
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0){
                s += a[i];
            }
        }
        System.out.println(s);
    }

    // sum of 1st half
    static void P13(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length/2; i++) {
            s += a[i];
        }
        System.out.println(s);
    }

    // sum of 2nd half
    static void P14(int[] a) {
        int s = 0;
        int n = a.length;
        if (n%2 != 0)
            n = n+1;

        for (int i = n/2; i < a.length; i++) {
            s += a[i];
        }
        System.out.println(s);
    }

    // min value from 1st half
    static void P15(int[] a){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length / 2; i++) {
            if (min > a[i])
                min = a[i];
        }
        System.out.println(min);
    }

    // // min from 2nd half
    static void P16(int[] a){
        int min = Integer.MAX_VALUE;
        int n = a.length;
        if (n % 2 != 0)
            n += 1;
        for (int i = n/2; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(min);
    }

    // max from 1st half
    static void P17(int[] a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length / 2; i++) {
            if (max < a[i])
                max = a[i];
        }
        System.out.println(max);
    }

    // max from 2nd half
    static void P18(int[] a){
        int max = Integer.MIN_VALUE;
        int n = a.length;
        if (n % 2 != 0)
            n += 1;
        for (int i = n; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max);
    }

    // avg value of 1st half
    static void P19(int[] a){
        int s = 0;
        for (int i = 0; i < a.length / 2; i++) {
            s += a[i];
        }
        System.out.println(s/(a.length/2));
    }

    // avg value in 2nd half
    static void P20(int[] a) {
        int n = a.length;
        int s = 0;
        if (n % 2 != 0)
            n = n + 1;
        for (int i = n / 2; i < a.length; i++) {
            s += a[i];
        }
        System.out.println(s/(a.length/2));
    }

    // print array in reverse
    static void P21(int[] a){
        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.print(a[i] + " ");
        }
    }

    // read first half in reverse
    static void P22(int[] a){
        for (int i = a.length/2 - 1; i >= 0 ; i--) {
            System.out.print(a[i] + " ");
        }
    }

    // read 2nd half in rev
    static void P23(int[] a){
        int n = a.length;
        if (n % 2 != 0)
            n = n + 1;
        for (int i = a.length - 1; i >= a.length / 2; i--) {
            System.out.println(a[i]);
        }
    }

    // read only even index elem
    static void P24(int[] a){
        for (int i = 0; i < a.length; i += 2) {
            System.out.println(a[i]);
        }
    }

    // read only even index in reverse
    static void P25(int[] a){
        for (int i = a.length - 1; i >= 0 ; i -= 2) {
            System.out.println(a[i]);
        }
    }

    // read only odd index
    static void P26(int[] a){
        for (int i = 1; i < a.length; i+=2) {
            System.out.println(a[i]);
        }
    }

    // read only odd index in rev
    static void P27(int[] a){
        for (int i = a.length-1; i >= 1 ; i-=2) {
            System.out.println(a[i]);
        }
    }

    // find idx of given elem
    static void P28(int[] a){
        int item = 7;
        for (int i = 0; i < a.length; i++) {
            if (item == a[i])
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,5,7,9};
        P28(arr);
    }
}

