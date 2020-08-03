package day14_Recap;
/*
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your country name: ");
        String countryName = input.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipcode = input.nextInt(); //12345

        input.nextLine(); // to take out enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your full company name: ");
        String company = input.nextLine();
    }
}
