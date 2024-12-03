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
public class SearchArray {
    public static void main(String[] args) {
        int []array={4,5,6,7,8};
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number search in array = ");
        int numberSearch = input.nextInt();
        boolean numFound=false;
        for(int item:array){
         if (item==numberSearch){
           numFound=true;     
         } 
        } 
        if(numFound==true){
            System.out.println("it is found");
        }else{
            System.out.println("it is not found");
        }
    }
}
