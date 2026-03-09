package collections;

import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(20);
        ts.add(40);
        ts.add(30);
        ts.add(15);
        // ts.add(null); // returns NullPointerException
        System.out.println(ts);

        System.out.println(ts.higher(20)); // higher than element
        System.out.println(ts.lower(20)); // lower than element
        System.out.println(ts.ceiling(20)); // = or >
        System.out.println(ts.ceiling(25));
        System.out.println(ts.floor(20)); // = or <
        System.out.println(ts.floor(25));
    }
}
