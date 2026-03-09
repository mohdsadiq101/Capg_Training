package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            ad.offer(sc.nextInt());
        }
        while (k > 0){
            ad.offer(ad.poll());
            k--;
        }
        System.out.println(ad);
    }
}
