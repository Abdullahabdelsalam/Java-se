/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.inherit;

/**
 *
 * @author Abdullah
 */
public class Employee extends Person{
    private int overTimeHours;
    private double overTimeRate;

    public Employee(int personld, String personName, double personGrossSalary, String personJob, 
            int overTimeHours, double overTimeRate) {
        // super : keyword in inheritance to call parent constructor from child constructor
        super(personld, personName, personGrossSalary, personJob);
        this.overTimeHours = overTimeHours;
        this.overTimeRate = overTimeRate;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }
    
    
    public double getMonthlyNetSalary(){
       int tax = 10; // local variable
        return getPersonGrossSalary() - getPersonGrossSalary() * tax / 100.0
                + overTimeHours * overTimeRate;
    }
    
    public double getAnnualNetSalary(){
        return getMonthlyNetSalary() * 12;
    }

    @Override /// annotations
    public void printPersonDetails() {
       // call the parent method from the child method in overriding 
            super.printPersonDetails();
       System.out.println("Monthly net = "+getMonthlyNetSalary());
        System.out.println("Annual net = "+getAnnualNetSalary());
    }

    @Override
    public String toString() {
        return "Emp has id = "+getPersonld()+", named : "+getPersonName()+", take net salary = "+getMonthlyNetSalary();
    }

    @Override
    public void printPersonData() {
            System.out.println("Employee data");
    }
    
    
      
    
    
}
