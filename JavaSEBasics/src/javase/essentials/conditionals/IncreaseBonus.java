/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.conditionals;

/**
 *
 * @author Abdullah
 */
public class IncreaseBonus {
    public static void main(String[] args) {
        double emplyeeSalary=3000;
        double bonus =0;
        
        if(emplyeeSalary>=5000){
            bonus=2000;
        }else {
            bonus=4000;
        }
        double netSalary=emplyeeSalary+bonus;
        System.out.println("the Emplyee Salary and bonus = " + emplyeeSalary + " bonus =" + bonus );
        System.out.println("Net salary = " + netSalary);
    }
}
