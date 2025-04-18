package ex_Collection_Framework.List;

import java.util.LinkedList;
import java.util.List;

public class Lab_Linked_List {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
