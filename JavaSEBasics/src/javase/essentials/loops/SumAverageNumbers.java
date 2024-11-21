/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.loops;

/**
 *
 * @author Abdullah
 */
public class SumAverageNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1 ; i < 101; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        double avrg=sum/100.0;
        System.out.println(avrg);
    }
}
