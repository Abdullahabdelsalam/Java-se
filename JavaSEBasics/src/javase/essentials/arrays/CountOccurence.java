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
public class CountOccurence {
       public static void main(String[] args) {
        int []array={5,5,5,7,7};
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number occurence = ");
        int number = input.nextInt();
        int countOccer=0;
        for(int item:array){
         if(item==number) {
             countOccer++;
         }  
        }
           System.out.println("number count occurence = " + countOccer);
       }
}
