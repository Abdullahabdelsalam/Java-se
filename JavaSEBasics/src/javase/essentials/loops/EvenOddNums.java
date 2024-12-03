/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.loops;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class EvenOddNums {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       int sumEven=0,sumOdd=0,countEven=0,countOdd=0,number;
       for(int i=1 ; i<6 ; i++){
           System.out.println("Enter a number = ");
           number=input.nextInt();
           if(number%2==0){
             countEven++;
             sumEven+=number;  
           }else{
              countOdd++;
              sumOdd+=number;
        }
       }
        System.out.println("sum of the even = " +sumEven);
        System.out.println("sum of the odd = " +sumOdd);
        System.out.println("count of the even = " +countEven);
        System.out.println("count of th odd = " +countOdd);
    }
 
}
