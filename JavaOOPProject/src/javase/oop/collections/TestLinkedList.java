/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Abdullah
 */
public class TestLinkedList {
    public static void main(String[] args) {
        // Stack   -   Queue
        
        System.out.println(" ---- LinkedList as a stack ----");
        // push()   | pop()
        LinkedList stack = new LinkedList();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        
        System.out.println(stack);
        System.out.println(stack.pop());    // 300
        System.out.println(stack.pop());    // 200
        System.out.println(stack.pop());    // 100
        
        System.out.println(stack);
        
        
        System.out.println("------------------ LinkedList as a queue -------------------------");
        LinkedList queue = new LinkedList();
        // add()    poll()
        queue.add(100);
        queue.add(101);
        queue.add(102);
        
        System.out.println(queue);
        System.out.println(queue.peek()); // 100
        System.out.println(queue.poll()); // 100
        System.out.println(queue.poll()); // 101
        System.out.println(queue.poll()); // 102
        System.out.println(queue);
        
        // convert from linkedlist to arraylist
        
        ArrayList ls = new ArrayList(stack);
        System.out.println(ls);
        
        
        
        
        
        
        
        
        
        
        
    }
}
