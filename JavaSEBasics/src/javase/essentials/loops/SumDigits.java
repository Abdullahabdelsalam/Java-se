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
public class SumDigits {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Number = ");
        int number=input.nextInt();
        int sumDigits=0 , digNumber =0 ;
        while(number>1){
          digNumber=number%10;
          number=(int)number/10;
          sumDigits += digNumber;   
        }
        System.out.println("sum digits = " + sumDigits);
    }
}
