/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.arrays;

import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class PositiveNegativeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []array = new int[5];
        for(int i=0 ; i<array.length ; i++){
            System.out.println("Enter number index ( " + i +") = ");
            array[i] =input.nextInt();
        }
        int sumPositive=0 ,sumNegative=0,countPosit=0,countNegat=0,countZero=0;
        for(int item:array){
            if(item<0){
               countNegat++;
               sumNegative += item;   
            }else if( item>0){
              countPosit++;
              sumPositive +=item;
            }else{
              countZero++;
            }   
        }
        System.out.println("sumNegative =" +sumNegative); 
        System.out.println("sumPositive =" +sumPositive); 
        System.out.println("countNegat =" +countNegat); 
        System.out.println("countPosit =" +countPosit); 
        System.out.println("countZero =" +countZero); 
    }
}
