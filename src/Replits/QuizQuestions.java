package Replits;

import java.util.Scanner;

public class QuizQuestions {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");
        String a = s.nextLine();


        String result = "";


        //your code here

        if (a.equals("a")) {
            result = "a is wrong";
        } else if (a.equals("b")) {
            result = "b is correct";
        } else if (a.equals("c")) {
            result = "c is wrong";
        } else {
            result = a+ " is not a valid answer";
        }
        System.out.println(result);
    }
}