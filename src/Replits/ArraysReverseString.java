package Replits;
import Library.Util;

import java.util.*;
public class ArraysReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below
        String [] words = sentence.split(" ");
        String reversedWords = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords += words[i]+ "\n";
        }
        System.out.print(reversedWords);
    }
}

