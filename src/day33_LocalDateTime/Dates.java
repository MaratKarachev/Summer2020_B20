package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

/*LocalDate: year, month, day
        methods:
        now(): gets the current date
        declare:
        of(year, month, day)
         */
public class Dates {
    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(1993, 11, 5);

        System.out.println(DOB);

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate y = LocalDate.of(2020, 1, 1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year, 1, 1).isLeapYear();

        System.out.println(result2);
        System.out.println("=================================");
        System.out.println("Enter birth year, birth month,  birth day");

        LocalDate d = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.println(d);

        System.out.println(d.isLeapYear());

    }
}
