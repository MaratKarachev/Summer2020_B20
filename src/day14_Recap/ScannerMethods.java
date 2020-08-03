package day14_Recap;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to learn Java?");
        String num=input.nextLine();

        System.out.println("You have entered: "+ num);


    }
}
