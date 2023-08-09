package revision;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(2);
        list.add("prime");
        list.add(null);
        list.add(true);
        list.add("prime");

        for (Object object : list) {
            System.out.println(object);


        }
        System.out.println("-----------------------");
        HashSet set = new HashSet();
        set.add("Green");
        set.add(2);
        set.add(null);
        set.add("Prime");

        for (Object o : set) {
            System.out.println(o);


        }
        System.out.println("------------------");

        HashMap<Integer, String> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap();
        map.put(1, "Prime");
        map.put(2, "Testing");
        map.put(3, "Java");


        Set Color = map.entrySet();

        for ( Object o : Color){
            System.out.println(o);
        }


    }
}
