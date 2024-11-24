/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class TestExceptions {
    public static void main(String[] args) {
         // Errors : 1. syntax error  -   2. logical errors    -   3. runtime errors : exceptions 
         /// handling exceptions 
         Scanner input = new Scanner(System.in);
       
       try{  
        System.out.println("please enter first num");
        int firstNumber =  input.nextInt();
        System.out.println("please enter second num");
        int secondNumber =  input.nextInt();
        
        int result = firstNumber + secondNumber;
         System.out.println("result = "+result);
       }catch(InputMismatchException ex){        
           System.out.println("Invalid value - must enter only numbers");
       }finally{
           System.out.println("this is the finally statement");
       }
         
         
         System.out.println("end of the program");
        
    }
}
