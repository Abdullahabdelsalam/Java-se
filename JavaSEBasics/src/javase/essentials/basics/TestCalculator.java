/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.basics;

/**
 *
 * @author Abdullah
 */
public class TestCalculator {
    public static void main(String[] args) {
        int firstNumber = 6;
        int secondNumber = 4;
         int addresult = firstNumber + secondNumber;
         System.out.println("Addition = " + addresult);
        int subtractResult = firstNumber -secondNumber;
        System.out.println("subtraction = " + subtractResult);  
        int multiResult = firstNumber*subtractResult;
        System.out.println("multiply = " + multiResult);
         double divideResult = (double)firstNumber / secondNumber;
         System.out.println("Divide = " + divideResult);
        System.out.println("-------------- Increment ++ -----------------------");  
        // increment 
        firstNumber++;
        firstNumber = firstNumber + 1;
        firstNumber += 1;
        System.out.println("After increment, first number = "+firstNumber);
       
          System.out.println("-------------- Decrement -- -----------------------");  
          firstNumber--;
          firstNumber = firstNumber - 1;
          firstNumber -= 1;
          System.out.println("After decrement, first number = "+firstNumber);
          
          System.out.println("----------------- Math class ----- power( )   sqrt( ) ------------");
          // Math power ()
      double powerResult = Math.pow(firstNumber, 3);
        System.out.println("power result = "+powerResult);
        
        // Math sqrt ()
        double sqrtResult = Math.sqrt(4);
        System.out.println("sqrt result = " + sqrtResult);
        
        System.out.println("------- Math --- round() -----------------");
        double invoiceTotal = 7566.8782143223432;   // 7566.88
            //    * 100 >   756687.82   |  round  > 756688     |        / 100.0     >   7566.88
          double roundResult =  Math.round(  invoiceTotal * 100    )  / 100.0;
          System.out.println("Round result = "+roundResult);
          
          
          System.out.println("----------------  casting : convert from int to double or vice versa ----------------");
          // convert from int to double : implicit casting | widening 
          int empCode = 101;
          double empCodeDbl = empCode;
          System.out.println("after convert to double - emp code = "+empCodeDbl);
          
          // convert from double to int : 
          double empSalary = 5660.78;
          int empSal = (int)empSalary;
          System.out.println("after converting from double to int - sal = "+empSal);
          long empSalRound = Math.round(empSalary);
          System.out.println("after rouding to zero deciamal - sal = "+empSalRound);
          
         System.out.println("----------------- % Mod Remainder -----------------------"); 
         System.out.println(4 / 2);
         System.out.println(11 % 3);
         // example : 140 seconds ; how many minutes and how many remaining seconds ? 
         int totalSeconds = 140;
         int totalMinutes = totalSeconds / 60;
         int remainingSeconds = totalSeconds % 60;
         System.out.println("total minutes = "+totalMinutes+", remaining seconds = "+remainingSeconds);
          
    }
}
