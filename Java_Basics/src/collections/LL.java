package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(2,25);
//        System.out.println(ll);
        System.out.println();

        Iterator itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
