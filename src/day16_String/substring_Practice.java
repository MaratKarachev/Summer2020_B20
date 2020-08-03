package day16_String;
/*
   1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */

import java.util.Scanner;

public class substring_Practice {
    public static void main(String[] args) {

        //Extra task:

        String str = "I like to drink Pepsi";
        //            012345678910111213141516(P)...
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10, 14+1);
        System.out.println(action);



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word"); // "Apple"
        String str1 = scan.next();
        System.out.println("Enter second word"); // "Banana"
        String str2 = scan.next();

        String result = str1.substring(1) + str2.substring(1);

        System.out.println(result);


    }
}
