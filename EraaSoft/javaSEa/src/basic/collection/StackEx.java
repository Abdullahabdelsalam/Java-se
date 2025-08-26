package basic.collection;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> emp = new Stack<>();
        emp.push("Abdullah");
        emp.push("Muhammed");
        emp.push("safe");
        emp.push("Ali");
        emp.push("Omer");
        emp.pop();
        emp.pop();
        for (String item : emp) {
            System.out.println(item);
        }
    }
}
