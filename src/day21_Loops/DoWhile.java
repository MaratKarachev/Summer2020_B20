package day21_Loops;


/*
do-while loop: do first, think later.
    do{
    statements
    }while (condition);
 */

public class DoWhile {
    public static void main(String[] args) {

        boolean result = false;
        while(result){
            System.out.println("Hello World");
        }

        System.out.println("=================================");

        do { //just do it, if it's wrong don't do it.
            System.out.println("Hello World");
        }while(result);
    }
}
