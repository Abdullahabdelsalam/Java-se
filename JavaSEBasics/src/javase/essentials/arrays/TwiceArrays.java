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
public class TwiceArrays {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []array = new int[5];
        for(int i=0 ; i<array.length ; i++){
            System.out.println("Enter number index ( " + i +") = ");
            array[i] =input.nextInt();
        }
        int []twiceArray=new int[5];
        for(int i=0 ; i < array.length ; i++ ){
           twiceArray[i]=array[i]*2;
            System.out.println(twiceArray[i]);
        }
      }
    
}
