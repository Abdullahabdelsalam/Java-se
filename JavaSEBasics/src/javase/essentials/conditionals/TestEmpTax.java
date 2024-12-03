/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.conditionals;

import java.util.Date;

/**
 *
 * @author Abdullah
 */
public class TestEmpTax {
    public static void main(String[] args) {
        int empId = 101;
        double empGrossSalary = 4000.0;
        String empName = "Ahmed Omar";
        char empGender = 'M';
        boolean hasCar = true;
        Date empHireDate = new Date();
        // salary < 5000 : tax = 0              |  salary >= 5000       : tax = 10 %
        int tax = 0;
        
        // 1 way if condition 
        if (empGrossSalary >= 5000){
            tax = 10;
        }
        
        double monthlyNetSalary = empGrossSalary - empGrossSalary * tax / 100.0;
        double annualNetSalary = monthlyNetSalary * 12;
        
        System.out.println("Monthly net salary = "+monthlyNetSalary);
        System.out.println("Annual net = "+annualNetSalary);
        System.out.println("Emp hire date = "+empHireDate);
        
    }
}
