/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author Abdullah
 */
public class TestHashSet {
    public static void main(String[] args) {
        // HashSet  : remove duplicates from elements       - note : elments not in order 
//        HashSet hs = new HashSet();
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(32);
        hs.add(70);
        hs.add(120);
        hs.add(70);
        hs.add(32);
        hs.add(50);
        
        System.out.println(hs);
        
        
        
    }
}
