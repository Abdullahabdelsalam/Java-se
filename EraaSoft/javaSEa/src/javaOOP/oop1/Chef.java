package javaOOP.oop1;

public class Chef extends Employee{
    public Chef(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }
    @Override
    public void work() {
        System.out.println("Chef " + getName() + " is preparing dishes");
    }
}
