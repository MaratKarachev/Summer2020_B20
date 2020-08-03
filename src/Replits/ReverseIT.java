package Replits;

import java.util.Scanner;

public class ReverseIT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int length = word.length();

        if (length < 5) {
            System.out.println("Too short!");
        } else if (length > 5) {
            System.out.println("Too long!");
        } else if (length == 5) {
            System.out.println(word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        }
    }
}
