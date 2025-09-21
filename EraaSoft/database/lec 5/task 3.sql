


--create Teacher with 
--id name salary

CREATE TABLE Language (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);


--create Language with
--id name 

CREATE TABLE Teacher (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    language_id INT NOT NULL,
    FOREIGN KEY (language_id) REFERENCES Language(id)
);


--Teacher has only Language
--Language has many Teacher

-- please create classes with relation

import java.util.HashSet;
import java.util.Set;

public class Language {
    private int id;
    private String name;
    
    private Set<Teacher> teachers = new HashSet<>();
    
    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.setLanguage(this); 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }
}


public class Teacher {
    private int id;
    private String name;
    private double salary;
    
    private Language language;

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
