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
public class TestVote {
    public static void main(String[] args) {
        // input from keyboard
        Scanner input = new Scanner(System.in);
               System.out.println("Enter your age"); 
        int age= input.nextInt();
//        if(age >18){
//            System.out.println("print he can vote"); 
//        }else if(age >= 11 && age <= 18 ){
//            System.out.println("print he cannot vote");
//        }else{
//            System.out.println("print enta bethazzar");
//        }

 if(age >18){
            System.out.println("print he can vote"); 
        }else if(age >= 11 ){
            System.out.println("print he cannot vote");
        }else{
            System.out.println("print enta bethazzar");
        }
    }
    
}
