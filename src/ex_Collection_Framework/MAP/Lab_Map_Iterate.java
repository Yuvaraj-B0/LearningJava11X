package ex_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_Map_Iterate {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap();
        student1.put("name", "Diwakar");
        student1.put("phone", "9876543210");
        student1.put("address1", "Bangalore");
        student1.put("address2", 123);

        for(Map.Entry<String, Object> items: student1.entrySet()){
            System.out.println(items.getKey()+" -> "+items.getValue());
        }
    }

}
