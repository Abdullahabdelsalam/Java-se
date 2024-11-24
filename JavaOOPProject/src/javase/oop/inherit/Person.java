/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.inherit;

/**
 *
 * @author Abdullah
 */
public abstract class Person {
    private int personld;
    private String personName;
    private double personGrossSalary;
    private String personJob;

    public Person() {
    }

    public Person(int personld, String personName, double personGrossSalary, String personJob) {
        this.personld = personld;
        this.personName = personName;
        this.personGrossSalary = personGrossSalary;
        this.personJob = personJob;
    }

    public int getPersonld() {
        return personld;
    }

    public void setPersonld(int personld) {
        this.personld = personld;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getPersonGrossSalary() {
        return personGrossSalary;
    }

    public void setPersonGrossSalary(double personGrossSalary) {
        this.personGrossSalary = personGrossSalary;
    }

    public String getPersonJob() {
        return personJob;
    }

    public void setPersonJob(String personJob) {
        this.personJob = personJob;
    }
 
    
    public void printPersonDetails(){
        System.out.println("person id = "+personld);
        System.out.println("person name = "+personName);
    }
    
    public abstract void printPersonData();
    
    
}
