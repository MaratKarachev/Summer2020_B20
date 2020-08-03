package day18_ForLoop;


import java.util.Scanner;


/*
4. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

 */
//without scanner:
public class initials {
    public static void main(String[] args) {

       /* String firstName = "java";
        String lastName = "programming";

        String initial1 = firstName.substring(0, 1) + lastName.substring(0, 1); //jp
        initial1 = initial1.toUpperCase(); // "JP"
        System.out.println(initial1);
         */

//with scanner:
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=input.next();
        firstName=firstName.substring(0,1);

        System.out.println("Please enter your last name");
        String lastName=input.next();
        lastName=lastName.substring(0,1);
        System.out.println(firstName+"." +lastName);
         */


//charAt:
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial = "" + ch1 + "." + ch2;
        initial = initial.toUpperCase();
        System.out.println(initial);


    }
}

