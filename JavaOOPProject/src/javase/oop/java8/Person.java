/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javase.oop.java8;

/**
 *
 * @author Abdullah
 */
public class Person {
    private int personId;
    private String personfirstName;
    private String personLastName;
    private int personAge;

    public Person(int personId, String personfirstName, String personLastName, int personAge) {
        this.personId = personId;
        this.personfirstName = personfirstName;
        this.personLastName = personLastName;
        this.personAge = personAge;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonfirstName() {
        return personfirstName;
    }

    public void setPersonfirstName(String personfirstName) {
        this.personfirstName = personfirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }
    
    
}
