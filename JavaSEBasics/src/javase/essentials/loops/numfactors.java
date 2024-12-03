/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.loops;

/**
 *
 * @author Abdullah
 */
public class numfactors {
    public static void main(String[] args) {
       int num=12;
       int factors;
       //1 2 3 5 7 11 (n)
       // / 1 2 3 4 5 6 
       // n/2
       for(int i=1 ;i<num+1 ;i++){ 
           System.out.println("i" +i); 
           for(int j=2 ; j<(i/2)+1; j++){    
               factors = i%j ;
              
               System.out.println("j" + j);
               System.out.println("fac = " + factors);
           }
        }
    }
  
}
