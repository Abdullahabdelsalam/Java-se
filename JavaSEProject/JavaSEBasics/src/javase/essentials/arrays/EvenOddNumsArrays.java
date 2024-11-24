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
public class EvenOddNumsArrays {
      public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int[] myArray = new int[5] ;
        System.out.println("Enter a number array");
        for(int i=0 ;i<myArray.length;i++){
            myArray[i]=input.nextInt();
        }
        int sumEven=0 , sumOdd=0,countEven=0,countOdd=0;
        for (int item :myArray){
             if(item%2==0){
               sumEven +=item; 
               countEven++;
            }else{
                sumOdd += item;
                countOdd++;
            }
        }
          System.out.println(" sum even = " + sumEven);
          System.out.println("sum odd = " + sumOdd);
          System.out.println("count even = " + countEven);
          System.out.println("count odd = " + countOdd);
      }    
}
