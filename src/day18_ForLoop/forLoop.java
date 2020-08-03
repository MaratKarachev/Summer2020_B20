package day18_ForLoop;

/*
    for loop:
    for (initialization; Condition;) {
    statements;
    }
    initialization: starting point
    int i = 0;
    condition: ending point, based on initialization

    i==0;
    i<100
    ....

    Iterator:Co-related to the condition.
     */
public class forLoop {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("=======================");

        for (int i = 0; i < 10; i++ ) { //i:0,1,2,3,4,5,6,7,8,9,10<10 ==>false

            System.out.println("Hello World");
        }
        System.out.println("Done");

        System.out.println("========================");

    }
}
