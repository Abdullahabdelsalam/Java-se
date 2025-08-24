package javaOOP.oop2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Chef("John", 30, 50000.0));
        employees.add(new Waiter("Alice", 25, 30000.0));
        employees.add(new Chef("Michael", 40, 60000.0));
        employees.add(new Waiter("Sarah", 22, 28000.0));

        for (Employee employee : employees) {
        employee.introduce();
        employee.work();

        if (employee instanceof Eatable) {
            ((Eatable) employee).eat();
        }
    }
}
}
