/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.employee.inhertanse;

/**
 *
 * @author Abdullah
 */
public class Accountant extends Employee {
  private String daliyInventory;

    public Accountant( String name, String emaliAddress, String department, String address, int yearOfBirth, float salary,String daliyInventory) {
        super(name, emaliAddress, department, address, yearOfBirth, salary);
        this.daliyInventory = daliyInventory;
    }

    public String getDaliyInventory() {
        return daliyInventory;
    }

    public void setDaliyInventory(String daliyInventory) {
        this.daliyInventory = daliyInventory;
    }
  
}
