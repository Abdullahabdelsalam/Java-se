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
public class CheckMixMin {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number  ;
        int max = 0 , min=0;
        for(int i=1 ;i<6 ;i++){
            System.out.println("Enter a number");
            number =input.nextInt();
            
            if(i == 1){
                max = number;
                min = number;
            }
            
            if(max<number){
               max=number;
            }  
            if(min>number){
                min=number;
            }
            
        }
        System.out.println( "max  =" + max);
        System.out.println(min);
    }
}
