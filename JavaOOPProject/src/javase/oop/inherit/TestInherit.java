/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.inherit;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abdullah
 */
public class TestInherit {
    public static void main(String[] args) {
        
        // take object from child not parent 
        Employee empAhmed = new Employee(101, "Ahmed", 7000,
                        "php developer", 10, 20.0);
        System.out.println("Monthly net = "+empAhmed.getMonthlyNetSalary());
        System.out.println("Annual net = "+empAhmed.getAnnualNetSalary());
     
        System.out.println("----------------------------------------------------------");  
        
        Manager ala =new Manager(102,"Ala",25000,"java",10);
        System.out.println(ala.getMonthlyNetSalary());
        System.out.println(ala.getAnnualNetSalary());
        double companyProfit = 1_000_000.00;
        System.out.println(ala.getAnnualNetSalary(companyProfit));
        
        System.out.println("---------------------- test overriding -----------------");
            empAhmed.printPersonDetails();
        System.out.println("------------- toString() method in Object class ------------------");
        System.out.println(empAhmed);
        System.out.println("----------------- test polmorphism -----------------");
        updateBonus(empAhmed, 2000);
        updateBonus(ala, 7000);
        
        
    } // end main
    public static void updateBonus(Person per, double bonus){
        
               System.out.println("person name = "+ per.getPersonName() );
               if (per instanceof Employee){
                    System.out.println("person monthly salry = "+  ((Employee)per).getMonthlyNetSalary());
               }else if(per instanceof Manager){
                    System.out.println("person monthly salry = "+  ((Manager)per).getMonthlyNetSalary());
               }
        
              
}
}