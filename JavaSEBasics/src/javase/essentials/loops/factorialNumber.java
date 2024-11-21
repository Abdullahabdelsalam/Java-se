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
public class factorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a factorial number = ");
        int number=input.nextInt(), factorial=1;
        
        for(int i=2 ;i<number+1 ;i++){
           factorial*=i; 
        }
        System.out.println(" factorial " +"(" + number + ") = " + factorial );
    }
}
