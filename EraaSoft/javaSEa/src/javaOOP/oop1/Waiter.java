package javaOOP.oop1;

public class Waiter extends Employee{
    public Waiter(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }
    @Override
    public void work() {
        System.out.println("Waiter " + getName() + " is preparing dishes");
    }
}
