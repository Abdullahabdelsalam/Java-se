package javaOOP.oop1;

public class Employee extends Person{
    private double salary;
    private String role;

    public Employee(String name, int age, double salary, String role) {
        super(name, age);
        this.salary = salary;
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void work() {
        System.out.println("I work as a " + role + " and my salary is " + salary + ".");
    }
}
