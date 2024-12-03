/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.methods;

/**
 *
 * @author Abdullah
 */
public class TestMethods {
    public static void main(String[] args) {
        System.out.println("abdallah");
        // CAlling addNumbers method
         int addResult = addNumbers(5, 6);
         System.out.println("Add result  "+addResult);
         System.out.println("Add result = "+addNumbers(7, 9));
         // call subtract
         int resultsub = subtractNumbers(15, 12);
         System.out.println("subtract = " + resultsub);
         //call multiply 
         int resultmul=multiplyNumbers(4, 5, 6);
         System.out.println("multiply = " + resultmul);
         
    } // end main
    
    // inputs = parameters = arguments 
    // return = output 
    public static int addNumbers(int a, int b){
         int result = a + b;
         return result;
    }
    
    // create 2 methods   -    subtractNumbers(int a, int b) return int
              // create method multiplyNumbers (int a, int b, int c ) return int 
    public static int subtractNumbers(int a ,int b) {
        int resultSub = a - b ;
        return resultSub ;
    }
    public static int multiplyNumbers(int a ,int b ,int c){
      return a * b *c ;
      
    }
}
