/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.conditionals;

/**
 *
 * @author Abdullah
 */
public class TestSwitch {
    public static void main(String[] args) {
        char gradeApprev = 'A';
        String grade;
        
       switch(gradeApprev){
           case 'A':
               grade = "Excllent";
               break;
           case 'B':
               grade = "v. Good";
               break;
           case 'C':
               grade = "Good";
               break;
           case 'E':
               grade = "Pass";
               break;
           default :
               grade = "Invalid value";
       }
       
        System.out.println("Grade = "+grade);
    }
}
