package Replits;

import java.util.Scanner;

public class SliceNumber {

    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        //47589 / 10000 => 4
        //47589 % 10000 => 7589
        //7589 / 1000 => 7
        //7589 % 1000 => 589
        //589 / 100 => 5
        //589 % 100 => 89
        //89 / 10 = 8
        //89 % 10 = 9


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number:");
        num = scan.nextInt();
        digit1 = num / 10000;
        num = num % 10000;

        digit2 = num / 1000;
        num = num % 1000;

        digit3 = num / 100;
        num = num % 100;

        digit4 = num / 10;
        digit5 = num % 10;

        System.out.println(digit1 + "\n" + digit2 + "\n" + digit3 + "\n" + digit4 + "\n" + digit5);
    }
}

