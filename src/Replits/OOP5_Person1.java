package Replits;

public class OOP5_Person1 {

    private String firstName;
    private String lastName;
    private int age;

    public OOP5_Person1(){
        firstName = "undefined";
        lastName = "undefined";
        age=-1;
    }

    public OOP5_Person1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


    public String toString() {
        return firstName +" | "+ lastName +" | "+ age;
    }

}
