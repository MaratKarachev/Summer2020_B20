package WarmUpTasks;

import java.util.Scanner;
/*
 write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
2. Write a program  CheckWords:
        Program accepts 3 words and :
        - if they are same length:      print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length"
 */

public class BreakfastJune28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=input.next();
        int length=word.length();
        String result="";

        if(length==0){
            result="string is empty";
        }else if(length>3){
        }



    }
}
