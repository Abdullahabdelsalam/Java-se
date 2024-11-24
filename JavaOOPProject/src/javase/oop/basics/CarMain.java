/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class CarMain {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setName("tesla");
        car1.setMaxSpeed(160);
        car1.setPrice(5555.5);
        car1.setModel(2020);
        System.out.println(car1.getName());
        System.out.println(car1.getMaxSpeed());
        System.out.println(car1.getPrice());
        System.out.println(car1.getModel());
        System.out.println("price EG = "+car1.PriceEg());
        
        Car car2=new Car("kia",150,2222,2022);
         System.out.println(car2.getName());
        System.out.println(car2.getMaxSpeed());
        System.out.println(car2.getPrice());
        System.out.println(car2.getModel());
        System.out.println("price EG = "+car2.PriceEg());
    }
 
}
