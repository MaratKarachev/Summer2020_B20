package day14_Recap;

import java.util.Scanner;

public class Address_WarmUp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your building number: ");
        int buildingNumber=input.nextInt();

        input.nextLine();

        System.out.println("Enter your street address: ");
        String streetAddress=input.nextLine();

        System.out.println("Enter the city name: ");
        String city=input.next();

        System.out.println("Enter the state: ");
        String state=input.next();

        System.out.println("Enter your zip code: ");
        int zipCode=input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();

        System.out.println("Ship to: " +fullName +"\n"+buildingNumber+" "+ streetAddress+"\n"+city+", "+ state+ " "+zipCode);
    }
}
