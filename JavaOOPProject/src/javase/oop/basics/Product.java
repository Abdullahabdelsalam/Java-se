/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.basics;

/**
 *
 * @author Abdullah
 */
public class Product {

    private String name;
    private String descirption;
    private float price;
    private int quantity;
    private float discount;

    public Product(String name, String descirption, float price, int quantity, float discount) {
        this.name = name;
        this.descirption = descirption;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
}
