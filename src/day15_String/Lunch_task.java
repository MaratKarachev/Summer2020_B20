package day15_String;
import java.util.Scanner;

        /* task: write a program that ask user to enter sentence.
        then print out the first and last characters
         */

public class Lunch_task{
public static void main(String[]args){



        Scanner input = new Scanner(System.in);
                System.out.println("Enter your sentence: ");
                String sentence = input.nextLine(); // I will be the best SDET!
                char ch1 = sentence.charAt(0);
                char ch2 = sentence.charAt(0);

                int allIndex=sentence.length();
                int lastIndex=sentence.length()-1;

                char lastChar=sentence.charAt(lastIndex);
                char firstChar=sentence.charAt(0);
    System.out.println(allIndex);
    System.out.println(firstChar);
    System.out.println(lastChar);
    }
}

