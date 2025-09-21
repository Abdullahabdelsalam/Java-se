


--create Doctor with 
--id name salary

CREATE TABLE Doctor (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
);


--create Patient with
--id name age

CREATE TABLE Patient (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL
);


--doctor has many patient
--patient has many doctor

CREATE TABLE Doctor_Patient (
    doctor_id INT NOT NULL,
    patient_id INT NOT NULL,
    PRIMARY KEY (doctor_id, patient_id),
    FOREIGN KEY (doctor_id) REFERENCES Doctor(id),
    FOREIGN KEY (patient_id) REFERENCES Patient(id)
);


--- please create classes with relation
import java.util.HashSet;
import java.util.Set;

public class Doctor {
    
    private int id;

    private String name;
    private double salary;

    private Set<Patient> patients = new HashSet<>();

    
    public Doctor() {}

    public Doctor(String name, double salary) {
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

    public Set<Patient> getPatients() {
        return patients;
    }
	 public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
}


