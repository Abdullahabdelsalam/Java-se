/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class TestDeserialize {
    public static void main(String[] args) {
        
        try {
            // deseerialize : convert objects back from a file to objects       FileInputStream ObjectInputStream
            FileInputStream fis = new FileInputStream("C:\\my_files\\employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
          Employee emp =  (Employee) ois.readObject();
         while(emp != null)   {
            System.out.println("id = "+emp.getEmployeeId()+", name = "+emp.getEmployeeName()+", salary = "+emp.getEmployeeSalary());
             emp =  (Employee) ois.readObject();
         }
         
        }catch(EOFException ex){
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestDeserialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestDeserialize.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestDeserialize.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        
    }
}
