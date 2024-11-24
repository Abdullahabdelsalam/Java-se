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
public class NumDivisible {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []array = new int[5];
        for(int i=0 ; i<array.length ; i++){
            System.out.println("Enter number index ( " + i +") = ");
            array[i] =input.nextInt();
        }
        for(int item:array){
            if(item%3==0){
                System.out.println("number divisible(3) =" +item);
            }
            if(item%5==0){
                System.out.println("number divisible(5) =" +item);
            }
        }
     }
}
