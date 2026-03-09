package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        ListIterator itr = al.listIterator(al.size());
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
