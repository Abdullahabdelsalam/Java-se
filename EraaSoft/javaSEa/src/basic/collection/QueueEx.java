package basic.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> emp = new LinkedList<>();
        emp.add("Abdullah");
        emp.add("Muhammed");
        emp.add("safe");
        emp.add("Ali");
        emp.add("Omer");
        emp.poll();
        for (String item : emp) {
            System.out.println(item);
        }
    }
}
