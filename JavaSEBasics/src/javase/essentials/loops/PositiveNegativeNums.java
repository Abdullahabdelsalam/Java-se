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
public class PositiveNegativeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumPosit=0 ,sumNegat=0 ,countposit=0,countNegat=0,countZero=0 ;
        for(int i=1 ; i<6 ; i++){
            System.out.println("Enter a Number = ");
            int number=input.nextInt();
            if(number>0){
                countposit++;
                sumPosit+=number;
            }else if(number<0){
                countNegat++;
                sumNegat+=number;
            }else{
                countZero++;
            }
        }
        System.out.println("sum positive = " +sumPosit);
        System.out.println("count positive = " +countposit);
        System.out.println("sum negative = " +sumNegat);
        System.out.println("count negative = " +countNegat);
        System.out.println("count zero = " +countZero);
    }
}
