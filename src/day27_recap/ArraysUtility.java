package day27_recap;

/*
sort():
toString():
equals():
 */

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        //sort && toString
        String[] names = {"Odina", "Liliia", "Berk", "Emine"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        int[] score = {80, 75, 65, 110, 90, 45, 56, 78};

        Arrays.sort(score);

        System.out.println(Arrays.toString(score));

        System.out.println("Maximum: " + score[score.length - 1]);
        System.out.println("Minimum: " + score[0]);

        System.out.println("===================================");

        //equals:

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};

        System.out.println(Arrays.equals(s1, s2));

        String[] s3 = {"C", "A", "B"};
        System.out.println(Arrays.equals(s1, s3)); //false

        String[] a1 = {"A", "C", "B"};
        String[] a2 = {"B", "A", "C"};
        Arrays.sort(a1); //a1: ABC
        Arrays.sort(a2); //a2: ABC
        System.out.println(Arrays.equals(a1, a2));

        String w1 = Arrays.toString(a1);
        System.out.println(w1);

        //Arrays.deepToString()
    }
}
