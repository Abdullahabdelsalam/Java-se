/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.arrays;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class ArrayLoops {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int[] myArray = new int[5] ;
        System.out.println("Enter a number array");
        for(int i=0 ;i<myArray.length;i++){
            myArray[i]=input.nextInt();
        }
        System.out.println("-------------------------------------");
        for(int i=0;i<5;i++ ){
            System.out.print("  " +myArray[i]);
        }
        System.out.println("\n");
        System.out.println("------------------------------");
        int sum=0 ;
        double avrg=0;
        for(int i=0;i<myArray.length;i++){
             sum += myArray[i];       
        }
        avrg =(double)sum/myArray.length;
        System.out.println("sum array = " + sum);
        System.out.println("avrg array = " + avrg);
    }
}
