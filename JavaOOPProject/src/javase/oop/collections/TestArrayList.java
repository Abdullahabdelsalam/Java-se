/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class TestArrayList {
    public static void main(String[] args) {
        int[] myArray = new int[5];     // 1- fixed start size - fixed data type
        myArray[0] = 16;    
        System.out.println(Arrays.toString(myArray));
        
        
        
        
        
        ArrayList myList = new ArrayList(); // 1- no fixed start size - 2- no fixed data type
        myList.add(15); myList.add(100.5);  myList.add("ahmed"); myList.add(77);
        
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(2));
        myList.add(2, "shereef");
        System.out.println(myList);
        
        
        System.out.println( myList.contains("ahmedd") );
        myList.remove(3);
        System.out.println(myList);
        
        
        
        System.out.println("------------ loop using for i loop ------ ");
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
        
        
        System.out.println("------------ loop using for each loop ------ ");
        for(Object item : myList){
            System.out.println(item);
        }
        
        
        
        
        
    }
}
