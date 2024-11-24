/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.employee.inhertanse;

/**
 *
 * @author Abdullah
 */
public class Developer extends Employee{
   private String projectName; 

    public Developer( String name, String emaliAddress, String department, String address, int yearOfBirth, float salary,String projectName) {
        super(name, emaliAddress, department, address, yearOfBirth, salary);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


   
}
