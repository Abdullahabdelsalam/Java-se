package javaOOP.oop1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Chef("Abdullah shmas", 53, 100000.0, "Head Chef"));
        employees.add(new Waiter("Omer Nasser", 30, 25000.0, "Waiter"));
        employees.add(new Chef("Muhammed Saber", 45, 95000.0, "Sous Chef"));
        employees.add(new Waiter("Zeyad Ahmad", 28, 22000.0, "Waiter"));


        for (Employee employee : employees) {
            employee.introduce();
            employee.work();
            System.out.println();
        }
    }
}
