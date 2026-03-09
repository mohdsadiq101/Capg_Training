package WrapperClasses;

public class Wrap {
    public static void main(String[] args) {
        int a = 10;

//        Integer i = new Integer(10); // not preferred
//        System.out.println(i);

        // Boxing
        Integer i = Integer.valueOf(a);
        System.out.println(a);

        // Auto Boxing
        Integer obj = i;
        System.out.println(obj);

        // Unboxing
        Integer obj2 = 20;
        int j = obj2.intValue();
        System.out.println(j);

        // Auto Unboxing
        int k = obj2;
        System.out.println(k);


    }
}
