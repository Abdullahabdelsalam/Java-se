/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.loops;

/**
 *
 * @author Abdullah
 */
public class NumDivisibleLoop {
    public static void main(String[] args) {
        for(int i=1 ; i<101; i++){
            if(i%3==0){
                System.out.println("the number div (3) = " + i);
            }else if(i%5==0){
                System.out.println("the number div (5) = " + i);
            }
        }
    }
    
}
