package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_nextMethods {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);//=>Enter
        System.out.println("Enter your salary: ");
        Double salary= scan.nextDouble(); //120000

        scan.nextLine();//=> takes everything including Enter from scanner

        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("Full name: "+ fullName);

    }
}
