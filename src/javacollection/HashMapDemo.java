package javacollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap();
        map.put(1,"BMW");
        map.put(2,"Audi");
        map.put(3,"BMW");
        map.put(4,"Toyota");
        System.out.println(map);
        map.put(5,"Mercedez");
        System.out.println(map);
        map.put(2,"Tesla");
        System.out.println(map);
        String value =map.get(4);
        System.out.println(value);
    }
}
