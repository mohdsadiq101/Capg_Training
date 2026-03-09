import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        Stream<Integer> s = null;
        Stream<Integer> s = Stream.of(2,4,3,5);
//        s.forEach(i -> System.out.println(i));

//        s.filter(i->i<4).map(i->i*i).forEach(num -> System.out.println(num));

        List<String> names = new ArrayList<>();
        names.add("Sadiq");
        names.add("");

    }
}
