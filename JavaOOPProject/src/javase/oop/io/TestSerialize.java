/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class TestSerialize {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ahmed", 7000.0);
        Employee e2 = new Employee(102, "Mostafa", 6000.0);
        Employee e3 = new Employee(103, "Marwa", 8000.0);
        
        
        try {
            // Serialize : Convert objects to a file        |       FileOutputStream    ObjectOutputStream
            FileOutputStream fos = new FileOutputStream("C:\\my_files\\employees.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);
            
            oos.flush();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSerialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestSerialize.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
    }
}
