package day13_Scanner;

import java.util.Scanner;

public class KgToLb {
    public static void main(String[] args) {

        Scanner kgTolb=new Scanner(System.in);
        System.out.println("Enter your weight in kilograms:");
        double kg= kgTolb.nextDouble();
        double lb=kg*2.205;

        System.out.println("Your weight equals to: "+lb+ " pounds");

        System.out.println("======================================");

        Scanner galToLit=new Scanner(System.in);
        System.out.println("How much gasoline would you like in gallons?");
        double gallons=galToLit.nextDouble();
        double litters=gallons*3.785;

        System.out.println("We have poured you "+ litters+ " litters");

    }
}
