package InterviewQuestions;

import java.util.Scanner;

public class DivideWithoutOperator {

    /*
    I will declare a variable count = 0, and In order to divide two numbers without using division operator,
     I will use a while loop, that will subtract num2 from num1 until it becomes equal or less than num1. And
    I will iterate a variable count for each time num2 gets subtracted.
     */

    public static void divide(int num, int divider) {

        int count = 0;
        while (num >= divider) {
            num -= divider;
            count++;
        }
        System.out.println("Output: " + count);
        System.out.println("Remainder: " + num);

    }

    public static void main(String[] args) {
        divide(81, 9);
    }
}
