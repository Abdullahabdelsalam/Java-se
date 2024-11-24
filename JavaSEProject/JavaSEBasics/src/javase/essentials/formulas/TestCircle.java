/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.formulas;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class TestCircle {
    public static void main(String[] args) {
         // 
         Scanner input = new Scanner(System.in);
         System.out.println("Enter circle radius");
         int radius = input.nextInt();
       //  final double PI = 3.145;  // constant 
            
         // double area = PI * Math.pow(radius, 2);
        double area = Math.PI * Math.pow(radius, 2);
            area = Math.round(area * 100) / 100.0;
        System.out.println("Area = "+area);
    }
}
