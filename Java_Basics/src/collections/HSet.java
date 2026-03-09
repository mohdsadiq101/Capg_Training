package collections;

import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(null);
        System.out.println(set);
    }
}
