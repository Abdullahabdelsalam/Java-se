/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.collections;

import java.util.HashMap;

/**
 *
 * @author Abdullah
 */
public class TestHashMap {
    public static void main(String[] args) {
        
        // HashMap : store every element as 2 par [ key - value ] 
        // put()        get()
        HashMap<String, String> hm = new HashMap();
        hm.put("db_name", "orcl");
        hm.put("port_no", "1521");
        hm.put("server_name", "localhost");
        
        System.out.println(hm);
        System.out.println(hm.get("port_no"));
        hm.put("port_no", "1522");
        System.out.println(hm.get("port_no"));
    }
}
