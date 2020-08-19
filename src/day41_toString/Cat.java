package day41_toString;

public class Cat {
       /*
    Task:
    Attributes: name, age, gender, color, breed
      Actions: eat, drink, toString
    Make sure that you can print out the objects of the Cat in the print statement

    CatObjects: create 5 objects of Cat and store them into an array variable
    print out the information of every single cat
    (DO NOT USE getInfo method)

    ArrayList:
    maleCats, femaleCats

     */

    String name;
    int age;
    char gender;
    String color;
    String breed;

    public void setCatInfo(String name, int age, char gender, String color, String breed) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.breed = breed;


    }

    public void eat(String catFood) {
        System.out.println(name + " is eating " + catFood);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() { // will be executed automatically when the cat object is passed in the print statement
        return "Name: "+ name + ", Age: " + age + ", Gender: " + gender + ", Color: " + color + ", Breed: " + breed+" | ";
    }
}
