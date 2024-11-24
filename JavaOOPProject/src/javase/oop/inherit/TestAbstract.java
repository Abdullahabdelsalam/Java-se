/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.inherit;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javase.oop.interfaces.Travel;

/**
 *
 * @author Abdullah
 */
public class TestAbstract {
    public static void main(String[] args) {
        // poly 1 
        // p1 : variable reference of Type person refer to Object of Type Employee
        // dynamic binding
        Person p1 = new Employee(101, "Ahmed", 7000,
                        "php developer", 10, 20.0);
        Employee e1 = (Employee) p1; // casting to Employee
        e1.getAnnualNetSalary();
        
        // poly 2
        // p2 : variable reference of Type person refer to Object of Type Manager
        Person p2 = new Manager(102,"Ala",25000,"java",10);
        
        
        // Error 
        ///Person p3 = new Person();
        //Calendar c1 = new Calendar();
        GregorianCalendar gc = new GregorianCalendar();
        
        System.out.println("-------------- check for consultant and interfaces -----");
        Consultant c1Esam = new Consultant();
         int numberDays = 6;
       double totalAcoomod = c1Esam.calcAccomodationCost(numberDays);
        System.out.println("Total accomod = "+totalAcoomod);
        
   //   Travel t1 = new Travel();  Error - cannot take object from interface like abstract class
   
        
    }
    
}
