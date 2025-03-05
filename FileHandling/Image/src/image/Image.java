/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Abdullah
 */
public class Image {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File file = new File("E:\\sd\\abdullah.jpg");
        FileInputStream fis = new FileInputStream(file);
        byte b[] = new byte[(byte)file.length()];
        fis.read(b);
        for(int i = 0; i < b.length; i++){
            System.out.println(b);
        }
        
        FileOutputStream fos = new FileOutputStream("E:\\sd\\abdullah2.jpg");
        fos.write(b);
        fos.flush();
        fos.close();
        fis.close();
        
    }
    
}
