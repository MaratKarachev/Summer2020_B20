package day13_Scanner;
/*
task 1. write a program that asks the user enter his car info:
                            brand
                            model
                            year
                            color
                            mileage
                            price
            ex: output format should be:
                    2012 Toyota Corolla white, 120000 miles, 12000 dollars
 */

import java.util.Scanner;

public class WarmUpTasksBeforeBed1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your car brand: ");
        String brandName=scan.next();
        System.out.println("Enter your car model: ");
        String modelName=scan.next();
        System.out.println("Enter your car year: ");
        String carYear=scan.next();
        System.out.println("Enter the color of your car: ");
        String color=scan.next();
        System.out.println("What's the mileage? ");
        String mileage=scan.next();
        System.out.println("What's the price? ");
        String price=scan.next();

        String carDetails= carYear+" " +brandName+ " "+ modelName+ " "+ color+ ", "+ mileage+ " miles, " + " " + price+" dollars";

        System.out.println(carDetails);
        scan.close();
    }
}
