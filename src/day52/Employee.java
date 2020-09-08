package day52;

import com.sun.xml.internal.bind.v2.model.core.ID;

/*
   2. create a subclass of person called Employee
            attributes: name, age, gender, ID, jobTitle, salary
            first constructor: can initialize name, age, gender of the employee
            second constructor: can initialize the entire attributes of the Employee class
            override the toString method  that can help you to print out the EmployeeObject

 */
public class Employee extends Person {

public int ID;
public String jobTitle;
public double salary;

    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nID: "+ID+"\nJob Title: "+jobTitle+"\nSalary: $"+salary;
    }

}
