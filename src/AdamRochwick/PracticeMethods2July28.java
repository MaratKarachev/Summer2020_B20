package AdamRochwick;

import java.util.Scanner;

public class PracticeMethods2July28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        create custom method, that returns int, and multiplies return value by 5
        custom method that will take user input as parameters
        custom method will add input, and divide by 2
         */

        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println(mathIsFun(a,b) *5);
    }

    public static int mathIsFun (int a, int b){
        return (a+b)/2;
    }
}
