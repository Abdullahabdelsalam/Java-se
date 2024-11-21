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
public class SumAverageInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int number;
        for(int i=1 ; i<6 ; i++){
            System.out.println("PLease enter a no.");
            number=input.nextInt();
            sum+=number;
        }
        System.out.println(sum);
        double average = sum / 5.0;
        System.out.println("average = "+average);
    }
    
}
