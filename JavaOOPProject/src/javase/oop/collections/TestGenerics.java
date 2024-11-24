/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.collections;

import java.util.ArrayList;
import javase.oop.inherit.Employee;

/**
 *
 * @author Abdullah
 */
public class TestGenerics {
    public static void main(String[] args) {
        // 3 employees objects
          Employee empAhmed = new Employee(101, "Ahmed", 7000,
                        "php developer", 10, 20.0); 
          Employee empMohamed = new Employee(102, "Mohamed", 7000,
                        "php developer", 10, 20.0);
          Employee empMarwa = new Employee(103, "Marwa", 7000,
                        "php developer", 10, 20.0);
        
      // create array list contains these employees    
        ArrayList<Employee> empsList = new ArrayList();
        empsList.add(empAhmed); empsList.add(empMohamed); empsList.add(empMarwa);
        
        // for each loop : print name - monthly net salary 
        for (Employee item : empsList){
            // Un Ncessary Casting : because the arraylist contains only employees
            //System.out.println(    ((Employee)item).getPersonName()+" "+  ((Employee)item).getMonthlyNetSalary());
             System.out.println(  item.getPersonName()+" "+  item.getMonthlyNetSalary());
        }
        
    }
}
