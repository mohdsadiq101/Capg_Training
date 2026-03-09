package collections;

import java.util.HashMap;

public class HMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,"Sadiq");
        map.put(2,"Jaladhi");
        map.put("Naina",3);
        map.put(null,5);
        map.put(null,null);
        System.out.println(map.get(1));

    }
}
