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
public class CheckMaxMin {
     public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
            
        // initialize Array 
        int[] myArray = {7, 14, 5, -6, 3};
        
        
        int max=myArray[0] , min=myArray[0];
        for(int i=0 ; i<myArray.length;i++){
          
            if(max <myArray[i]){
                max=myArray[i];
            }
            if(min >myArray[i]){
                min=myArray[i];
            }
        }
         System.out.println("max = " + max);
         System.out.println("min = " + min);
     }
}
