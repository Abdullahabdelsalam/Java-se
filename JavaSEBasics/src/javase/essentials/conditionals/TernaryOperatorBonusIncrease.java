/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.conditionals;

/**
 *
 * @author Abdullah
 */
public class TernaryOperatorBonusIncrease {
    public static void main(String[] args) {
              double emplyeeSalary=3000;
        // ternary operator
      double  bonus = (emplyeeSalary >= 5000 ? 2000 : 4000);
 double netSalary=emplyeeSalary+bonus;
        System.out.println("the Emplyee Salary and bonus = " + emplyeeSalary + " bonus =" + bonus );
        System.out.println("Net salary = " + netSalary);
    }
}
