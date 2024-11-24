/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Abdullah
 */
public class TestJava7 {

    public static void main(String[] args) {

        Date d1 = new Date();
        Date d2 = new Date();

        int result = d1.compareTo(d2);      // +1           -1              0

        ArrayList<Person> personsList = new ArrayList();
        Person p1 = new Person(101, "Ahmed", "Mohamed", 30);
        Person p2 = new Person(102, "Mostafa", "Medhat", 20);
        Person p3 = new Person(103, "Hesham", "Ayman", 40);
        Person p4 = new Person(104, "Aly", "Sabry", 25);

        // add 4 persons objects to personsList 
        personsList.add(p1);
        personsList.add(p2);
        personsList.add(p3);
        personsList.add(p4);

        System.out.println("---- Sort persons asc before priting by Age ------");
        // i need object from class implements Comparator interface
        // SortPersonAge spa = new SortPersonAge();
        // Collections.sort(personsList, spa );

        // Sort List using anonymou class [ implement interface inside the method parameter directly ]
        Collections.sort(personsList, new Comparator<Person>(){
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
            
        });

        System.out.println("---- printing all persons -------");
        printAllPersons(personsList);
        
        System.out.println("\n -------- printing persons with first name start with A ---------");
        printPersonsStartWithA(personsList);
        
        System.out.println("\n ------------- Rewrite the filter by first letter A using printPersonsconditionally method -----  ");
        printPersonsConditionally(personsList, new ConditionalInterface(){
            @Override
            public boolean filter(Person p) {
                return p.getPersonfirstName().startsWith("A");
            }
            
        });
        
        System.out.println("\n--- use method printPersonconditionally to print only persons with age > 30 -------");
        
        printPersonsConditionally(personsList, new ConditionalInterface() {
            @Override
            public boolean filter(Person p) {
               return p.getPersonAge()>30;
            }
        });
        
        System.out.println("\n--- use method printPersonconditionally to print All Persons  -------");
            printPersonsConditionally(personsList, new ConditionalInterface() {
            @Override
            public boolean filter(Person p) {
               return true;
            }
        });
        

    } // end main

    public static void printAllPersons(ArrayList<Person> personsList) {
        for (Person p : personsList) {
            System.out.print("\nPerson id = " + p.getPersonId());
            System.out.print(", Person F name = " + p.getPersonfirstName());
            System.out.print(", Person L name = " + p.getPersonLastName());
            System.out.print(", Person Age = " + p.getPersonAge());
        }
    }
    
    public static void printPersonsStartWithA(ArrayList<Person> personsList){
         for (Person p : personsList) {
             if(p.getPersonfirstName().startsWith("A")){
                System.out.print("\nPerson id = " + p.getPersonId());
                System.out.print(", Person F name = " + p.getPersonfirstName());
                System.out.print(", Person L name = " + p.getPersonLastName());
                System.out.print(", Person Age = " + p.getPersonAge());
             }
        }
    }
    
    // generic method used with any filter condition 
        public static void printPersonsConditionally(ArrayList<Person> personsList, ConditionalInterface condition){
             for (Person p : personsList) {
             if(condition.filter(p) == true){
                System.out.print("\nPerson id = " + p.getPersonId());
                System.out.print(", Person F name = " + p.getPersonfirstName());
                System.out.print(", Person L name = " + p.getPersonLastName());
                System.out.print(", Person Age = " + p.getPersonAge());
             }
        }
        }
}
