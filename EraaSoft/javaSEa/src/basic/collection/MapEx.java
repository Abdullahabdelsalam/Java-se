package basic.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> emp = new HashMap<>();
        emp.put(1,"Abdullah");
        emp.put(2,"Muhammed");
        emp.put(3,"safe");
        emp.put(4,"Ali");
        emp.put(5,"Omer");
        for (Map.Entry<Integer, String> entry : emp.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
