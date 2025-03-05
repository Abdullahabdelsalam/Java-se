package basic;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args){

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        //basic.Arrays.sort(fruits);
        //basic.Arrays.fill(fruits, "pineapple");

//        for(int i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // __________________________Arrays input_______________________________
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }
        //__________________________SEARCH an ARRAY ___________________________
        String[] fruit = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for(int i = 0; i < fruit.length; i++){
            if(fruit[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }
//___________________________ 2D array ________________________________________________
        // 2D array = An array where each element is an array
        //                    Useful for storing a matrix of data

        //-----------------------
        //   EXAMPLE 1
        //-----------------------

        String[][] groceries = {{"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}};

        groceries[2][1] = "eggs";

        for(String[] food : groceries){
            for(String foodS : food){
                System.out.print(foodS + " ");
            }
            System.out.println();
        }

        //-----------------------
        //   EXAMPLE 2
        //-----------------------

        char[][] telephone = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }



        scanner.close();

    }

}
