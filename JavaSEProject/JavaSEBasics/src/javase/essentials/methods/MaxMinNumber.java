/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.methods;

/**
 *
 * @author Abdullah
 */
public class MaxMinNumber {
    public static void main(String[] args) {
      int [] myArray ={20,30,34,89,190};
      int maxNum=getMaxNum(myArray);
        System.out.println("max = " +maxNum);
        int minNum=getMinNum(myArray);
        System.out.println("min = " + minNum);
    }
    public static int getMaxNum(int [] myArray) {
        int maxNum = myArray[0]; 
        for(int item:myArray){
         if(maxNum < item){
             maxNum =item;
         }   
        }
        return maxNum;
    }
    public static int getMinNum(int [] myArray) {
        int minNum = myArray[0]; 
        for(int item:myArray){
         if(minNum > item){
             minNum =item;
         }   
        }
        return minNum;
    }
}
