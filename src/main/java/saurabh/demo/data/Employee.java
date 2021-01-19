package saurabh.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    String empId;
    String name;
    String email;

    public String getEmpId() {
        return this.empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(){

    }

    public Employee(String empId , String name , String email){

        this.email = email;
        this.name  = name;
        this.empId = empId;

    }

    
}
