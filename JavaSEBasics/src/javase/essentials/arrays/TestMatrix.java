/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.essentials.arrays;

/**
 *
 * @author Abdullah
 */
public class TestMatrix {
    public static void main(String[] args) {
       int[] myArray = {7, 2, 4, 3};
       int[][] myMatrix = {
                            {7, 2, 4, 3},
                            {9, 3, 2, 5},
                            {20, 7, 4, 1}
                            };
       for(int i = 0; i < 3; i ++){
           for(int j = 0; j < 4; j++){
               System.out.print(myMatrix[i][j]+" ");
           }
           System.out.println("");
       }
    }
 
}
