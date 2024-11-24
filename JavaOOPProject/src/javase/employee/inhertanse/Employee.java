/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.employee.inhertanse;

/**
 *
 * @author Abdullah
 */
public class Employee {
   private String name; 
   private String emaliAddress;
   private String department;
   private String address;
   private int yearOfBirth;
   private float salary;

    public Employee(String name, String emaliAddress, String department, String address, int yearOfBirth, float salary) {
        this.name = name;
        this.emaliAddress = emaliAddress;
        this.department = department;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public Employee() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmaliAddress() {
        return emaliAddress;
    }

    public void setEmaliAddress(String emaliAddress) {
        this.emaliAddress = emaliAddress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
   
}
