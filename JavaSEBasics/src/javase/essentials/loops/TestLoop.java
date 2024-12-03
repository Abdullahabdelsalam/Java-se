/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.loops;

/**
 *
 * @author Abdullah
 */
public class TestLoop {
    public static void main(String[] args) {
        /* 3 types of Loops 
            1. for i loop
            2. while loop
            3. do while loop
            */
       // for i loop
       // print numbers from 1 to 10
       System.out.println("------------------- using for loop -----------------");
       for(int i = 1; i < 11; i++){
           System.out.print("welcome : "+i+" ");
       }
        System.out.println("");
        // /-----------------------------
        System.out.println("------------------- using while loop -----------------");
        int counter = 1;
        while( counter < 11){
            System.out.print("welcome : "+counter+" ");
            counter++;
        }
        System.out.println("\n-------------------------------");
        System.out.println("-------------do while loop ------------");
       counter = 1; // reset counter 
        do{
          System.out.print("welcome : "+counter+" ");
            counter++;
        }while(counter < 11);
        System.out.println("\n--------------");
    }
 
}
