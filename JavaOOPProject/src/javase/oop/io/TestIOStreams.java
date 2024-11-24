/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah
 */
public class TestIOStreams {
    public static void main(String[] args) {
        try {
            // Input Stream |  FileInputStream      BufferedInputStream
            FileInputStream fis = new FileInputStream("C:\\my_files\\abdullah.jpg");
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            // Output Stream    |   FileOutputStream        BufferedOutputStream
            FileOutputStream fos = new FileOutputStream("C:\\my_files\\abdullah2.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            // process
            byte[] buffer = new byte[10240];   // 10 kb
            int i = bis.read(buffer);
            
            while(i != -1){
                System.out.println("inside the loop "+ i);
                bos.write(buffer, 0 , i);
                i = bis.read(buffer);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
