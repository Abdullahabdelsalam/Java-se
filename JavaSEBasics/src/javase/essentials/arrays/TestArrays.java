/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.arrays;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class TestArrays {
    public static void main(String[] args) {
        int x = 10;
        int [] myArray = new int[5];
        
        myArray[0] = 7;
        myArray[1] = 9;
        myArray[2] = 13;
        myArray[3] = 6;
        myArray[4] = 13;
        
        System.out.println(Arrays.toString(myArray));
        
        myArray[2] = 34;
        System.out.println(Arrays.toString(myArray));
        
        // loop over array
        int sum  = 0;
        for(int i = 0; i < 5; i++){
            System.out.println(myArray[i]);
            sum = sum + myArray[i];
        }
        System.out.println("sum = "+sum);
        
      System.out.println("+++++++++++++++  foreach loop : donot use index ++++++++++++++++");
        for(int item : myArray){
            System.out.println(item);
        }
        
        
    }
}
