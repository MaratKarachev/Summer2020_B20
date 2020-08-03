package day21_Loops;

/*
write a program that asks user to enter 5 numbers and returns the minimum number
 */

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        int min = 2147483647;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt(); //10,20,30,40,50

            if(num<min){
               min=num; //10 is the minimum number
            }

        }
        System.out.println("Minimum number is:"+min);

    }
}
