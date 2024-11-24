/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.collections;

import java.util.TreeSet;

/**
 *
 * @author Abdullah
 */
public class TestTreeSet {
    public static void main(String[] args) {
        // TreeSet : Order elements in Asc order - remove duplicate
        TreeSet ts = new TreeSet();
        ts.add(40);
        ts.add(30);
        ts.add(80);
        ts.add(30);
        
        System.out.println(ts);
        
        
    }
}
