package collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ADQueue {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.addFirst(10);
        ad.addFirst(20);
        ad.addLast(30);
        ad.addLast(60);
        ad.addFirst(50);

        System.out.println(ad);

        Iterator itr = ad.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
