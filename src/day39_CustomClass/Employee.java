package day39_CustomClass;

public class Employee {
    /*
    Employees:
    Attributes: employeeName, gender, SSN, JobTitle, Salary
    Actions: attendMeeting, Working, getInfo, SetInfo

    ArrayList of employees:
    1. remove all the employees who are making less than 100K
    2. remove all the QA's
     */

    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo (String employeeName, char employeeGender, String employeeSSN, String employeeJobTitle,
                                 double employeeSalary){

        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: " + name+ ", gender: "+gender+ ", jobTitle: "+ jobTitle+", salary: "+salary);

        String ssn = "" + SSN;
        System.out.println(" SSN: " + ssn.substring(ssn.length()-4));
        System.out.println("Last four digits of SSN: "+ SSN);

    }
}
