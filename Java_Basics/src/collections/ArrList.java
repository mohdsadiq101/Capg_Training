package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); // if no generic type is specified it can take different types

        // Default constructor, creates an empty ArrayList with an initial capacity of 10
        ArrayList<String> listdef = new ArrayList<>();

       // Creating an ArrayList with a specified initial capacity
        ArrayList<String> listWithCapacity = new ArrayList<>(20);

        // Creating an ArrayList from another collection
        List<String> anotherList = Arrays.asList("Apple", "Banana", "Orange" );
        ArrayList<String> listFromCollection = new ArrayList<>(anotherList);


//        al.add(10);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//        al.add("hello");
//
//        for (Object i : al){
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//        }
//
//        // for traversing the elements without loop
//        Iterator cursor = al.iterator();
//        while (cursor.hasNext()){
//            System.out.println(cursor.next());
//        }

        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list.getClass().getName());

        String[] arr = {"Monday","Tuesday", "Wednesday"};
        List<String> list2 = Arrays.asList(arr);
        System.out.println(list.getClass().getName());

    }
}
