package day22_NestedLoop;

import java.util.Scanner;

/*
Write a program that asks user to enter a string. If string started with uppercase and ends
with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */
public class UpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        boolean starts = first >= 65 && first <=90; //from Ascii Table, upper case characters range
        boolean ends = last>= 97 && last<=122; //from Ascii Table, lower case characters range

        System.out.println(starts && ends);


    }

}

