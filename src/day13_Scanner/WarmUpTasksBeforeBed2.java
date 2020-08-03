package day13_Scanner;

/*
 write a program that asks the user enter the:
                    1. company name
                    2. first name
                    3. last name
                    4. Job title
                    5. salary
 */

import java.util.Scanner;

public class WarmUpTasksBeforeBed2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter company name: ");
        String companyName=scan.nextLine();
        System.out.println("Enter your first name: ");
        String firstName=scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastName=scan.nextLine();
        System.out.println("Enter your job title: ");
        String jobTitle=scan.nextLine();
        System.out.println("Enter your salary: ");
        int salary=scan.nextInt();

        String aboutMe=companyName+ ", " + firstName+ " " + lastName+ " "+ jobTitle+ " " + salary + " dollars";
        System.out.println(aboutMe);
        scan.close();
    }
}
