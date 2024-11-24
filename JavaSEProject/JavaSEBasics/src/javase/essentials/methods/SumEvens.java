/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.methods;

/**
 *
 * @author Abdullah
 */
public class SumEvens {
    public static void main(String[] args) {
      int [] myArray = {5, 7, 8, 10, 4, 5};  
       int result = sumEvenNumbers(myArray);
        System.out.println("sum even = " + result);
    }
    public static int sumEvenNumbers(int[] myArray) {
         int sumEven =0;
         for (int item:myArray){
             if(item%2==0){
                 sumEven +=item;
             }
         }
         return sumEven ;
    }
  
}
