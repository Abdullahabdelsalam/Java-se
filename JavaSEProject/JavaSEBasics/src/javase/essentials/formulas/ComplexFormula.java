/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.formulas;

/**
 *
 * @author Abdullah
 */
public class ComplexFormula {
    public static void main(String[] args) {
        int x =2 , y = 3 ,a = 4 ,b = 5 , c = 6 ;
        double fristPart , scanedPart ,theerPart; 
              fristPart = (3 + 4*x) / 5.0;
              scanedPart = (10*((y-5)*(a+b+c))) / (double)x ;
              theerPart = 9*((4.0/x)+((9 + x)/(double)y));
              double result = fristPart - scanedPart + theerPart;
              System.out.println("the Result = " + result );
        
    }
}
