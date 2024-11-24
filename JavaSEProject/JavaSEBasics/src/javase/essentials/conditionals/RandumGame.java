/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.conditionals;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class RandumGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     //   System.out.println(      (int)( Math.random() * 100 )    );
   int correctAnswers = 0; int wrongAnsers = 0;
     while(true){ 
        
        int x =  (int)( Math.random() * 100 ) ;
        int y =  (int)( Math.random() * 100 ) ;
        int z=x+y;
        
        System.out.println(x + " + "+ y + " = ");
        System.out.println("Enter -1 to Exit");
        int userResult = input.nextInt();
        if(userResult == -1){
            break;
        }
        if(userResult==z){
            correctAnswers++;
            System.out.println("correct answer ");
        }else{
            wrongAnsers++;
            System.out.println("wrong answer");
        }
        
    } // end loop
        System.out.println("No. of correct anwers = "+correctAnswers);
        System.out.println("No. of wrong anwers = "+wrongAnsers);
    }
 
}
