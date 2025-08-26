package basic.collection;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> emp = new ArrayList<>();

        emp.add("Abdullah");
        emp.add("Muhammed");
        emp.add("safe");
        emp.add("Ali");
        emp.add("Omer");
        emp.remove("safe");
        for (String item : emp) {
            System.out.println(item);
        }
    }

    }

