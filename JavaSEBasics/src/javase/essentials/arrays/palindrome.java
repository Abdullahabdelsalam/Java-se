/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.arrays;

/**
 *
 * @author Abdullah
 */
public class palindrome {
     public static void main(String[] args) {
        int []array={2,5,1,1,5,2};
        boolean palind=true;
      for(int j=0, i = array.length - 1 ; j<(array.length)/2; j++, i--){
          if (array[j] != array[i]){
              palind = false;
              break;
          }
      }
      if(palind==true){
          System.out.println("it is palindrome");
      }else{
          System.out.println("it is not palidrome");
      }
     }
}
