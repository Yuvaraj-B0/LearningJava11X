package ex_Collection_Framework.SET;

import java.util.*;

public class Lab_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element
        // no order.
        // no duplicates
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        // hs.add(123);
        hs.add(null);
//        hs.add(null);
        System.out.println(hs);
        System.out.println(" -----------HashSet----------------");

        for (String s: hs){
            System.out.println(s);
        }
        System.out.println(" -----------HashSet----------------");
        // Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(" ---------------------------");
        Set lhs=new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());
        System.out.println(" -----------LinkedHashSet----------------");
        for (Object s: lhs){
            System.out.println(s);
        }
        System.out.println(" -----------LinkedHashSet----------------");
        // Iterator
        Iterator iterator1 = lhs.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println(" ---------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
//        ts.add("");
//        ts.add(123);  // java.lang.ClassCastException
//        ts.add(null); // java.lang.NullPointerException
        System.out.println(ts);
        System.out.println(" -----------TreeSet----------------");
        for (Object s: ts){
            System.out.println(s);
        }
        System.out.println(" -----------TreeSet----------------");
        // Iterator
        Iterator iterator2 = ts.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


    }
}
