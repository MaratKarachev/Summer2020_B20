package Replits;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        String text = input.next();
        int length = text.length();


        System.out.println(length);
    }
}
