/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.java8;

import java.util.Comparator;

/**
 *
 * @author Abdullah
 */
public class SortPersonAge implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getPersonAge() > p2.getPersonAge()){
            return 1;
        }else if(p1.getPersonAge() < p2.getPersonAge()){
            return -1;
        }else{
            return 0;
        }
    }
    
}
