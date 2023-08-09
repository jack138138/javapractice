package javacollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        //HashSet declaration
        HashSet<String> set = new HashSet<>();
        set.add("JAVA");
        set.add("Selenium");
        set.add("API");
        set.add("SQL");



        System.out.println(set);
        for (String name : set ){
            System.out.println(name);
        }


        Iterator<String> list = set.iterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }

}
