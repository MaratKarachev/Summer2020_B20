package Replits;

import java.util.Scanner;

public class For_Loop1 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        //hello
        //01234

        //write your code below
        for (char ch = word.charAt(0); ch <= word.charAt(word.length() - 1); ch++) {

            System.out.println(ch+ " ");

        }
    }
}
