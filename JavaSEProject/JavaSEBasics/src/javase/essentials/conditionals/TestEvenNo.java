/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.conditionals;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class TestEvenNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number =input.nextInt();
        if(number%2==0){
            System.out.println("it is even "); 
        }else{
            System.out.println("it is odd ");
        }
    }
 
}
