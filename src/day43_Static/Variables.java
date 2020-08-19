package day43_Static;

/*
Static Review: variable & method. static vs instance
Static Block
Static Import

a: static
b: instance

local variable: declared within a block or method. Cannot be used outside its block. Must be initialized before use.

instance variable:

static variable:

static variable vs instance variable:

        static variable: we only use it if one common feature can be shared by all objects of the class
        if we want all the objects to have the same date

        instance variable: we only use it if there is not one common feature, and each object need to have different copy
        if we want object to have the unique data


CybertekStudent:

studentName
gender
age
ID
static SchoolName = "Cybertek School";
static dreamJob = "SDET";
static hasRepl.it = true;
static tuition


Book:

 name
 Author
 price
 static readable
 static hasTitle



 */

public class Variables {
    //instance variable:
    int d;
    //static variable:
    static int s;
    //instance variable:
    public void method2(){
        System.out.println(d);
        System.out.println(s);
    }


    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(s);

       // System.out.println(d); // static ONLY accepts static

        Variables obj = new Variables();
        System.out.println(obj.d);

    }
    //local variable:
    public static void method1(){
        int a = 10;

        if(true){
            int b = 20;
        }
       // System.out.println(b);

        System.out.println(a);
    }

}
