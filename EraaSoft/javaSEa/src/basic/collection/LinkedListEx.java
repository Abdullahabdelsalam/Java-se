package basic.collection;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> emp = new LinkedList<>();
        emp.addLast("Abdullah");
        emp.add("Muhammed");
        emp.add("safe");
        emp.add("Ali");
        emp.addFirst("Omer");
        emp.remove("safe");
        for (String item : emp) {
            System.out.println(item);
        }
    }
}
