/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.employee.inhertanse;

/**
 *
 * @author Abdullah
 */
public class Supplier extends Employee{
  private String city;

    public Supplier( String name, String emaliAddress, String department, String address, int yearOfBirth, float salary,String city) {
        super(name, emaliAddress, department, address, yearOfBirth, salary);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
  
  
}
