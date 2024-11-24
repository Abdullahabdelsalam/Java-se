/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class TestTextFiles {
    public static void main(String[] args) {
        try {
            // Read from text files     :    FileReader     BufferedReader
            FileReader fr = new FileReader("C:\\my_files\\read_data.txt");
            BufferedReader bfr = new BufferedReader(fr);
            
           String text =  bfr.readLine();
           while(text != null){
               System.out.println(text);
               text = bfr.readLine();
           }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestTextFiles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestTextFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("------------------------- Writing to Text Files -----------"); // FileWriter    BufferedWriter
        try {
            FileWriter fw = new FileWriter("C:\\my_files\\write_data.txt");
            BufferedWriter bfw = new BufferedWriter(fw);
            
            bfw.write("This is Java Training");
            bfw.newLine();
            bfw.write("This is IO Lesson");
            bfw.newLine();
            bfw.write("This is OOP Lesson");
            
            bfw.flush();
            
            ////// task : read from a file then write to another file 
            
            
        } catch (IOException ex) {
            Logger.getLogger(TestTextFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
