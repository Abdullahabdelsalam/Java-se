/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javase.oop.interfaces;

/**
 *
 * @author Abdullah
 */
public interface Travel {
 
    public abstract double calcTicktCost();
    public abstract double  calcAccomodationCost(int numberDays);
    public abstract double calcPerdimCost();
    
    public static final double DAY_COST = 50;
}
