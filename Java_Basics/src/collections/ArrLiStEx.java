package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrLiStEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        for (Integer i : al) {
            if (i.equals(4))
                al.remove(i);
            System.out.println(al);
        }
        // ConcurrentModificationException bcoz arraylist is being modified while being traversed
        // to overcome we use iterator

//        List<Integer> al = new CopyOnWriteArrayList();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        System.out.println(al);
    }
}

