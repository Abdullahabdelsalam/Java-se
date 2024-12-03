/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.methods;

/**
 *
 * @author Abdullah
 */
public class CheckEven {
    public static void main(String[] args) {
       boolean result = checkEven(7);
        if(result == true){
            System.out.println("this number is even");
        }else{
            System.out.println("this number is odd");
        }
    }
    public static boolean checkEven(int a) {
        if( a%2 == 0){
          return true ;  
        }else{
            return false ;
        }
    }
 
}
