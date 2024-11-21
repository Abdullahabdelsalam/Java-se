/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.methods;

/**
 *
 * @author Abdullah
 */
public class SumNumbers {
    public static void main(String[] args) {
      double result = sumNum();
        System.out.println("sumNum = " + result);
    }
    public static double sumNum() {
        double result=0;
        for(int i=1 ; i<101 ; i++){
            result +=i ;
        }
       return result ; 
    }
 
}
