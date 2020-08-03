package day27_recap;

/*
Arrays: single & multi-dimensional

single dimensional: a variable that contains elements(collection of elements)-each element has index.
declare:
DataType[] name = {data1, data2, data3...}

default values:
int, long, byte, short =>0
float, double => 0.0
boolean => false
char =>

length-1==>last index

multi dimensional: a variable that contains arrays (collection of arrays)-each array has index.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {

        String[] names = {"Aalia", "Nurbiye", "Ayse", "Nadir", "Muhtar"};
        //index:              0        1         3

        System.out.println(names[1]);

        System.out.println("====================================");

        for (int i = 0; i <= names.length - 1; i++) {

            // if (names[i].charAt(0) != 'A') {
            if (!names[i].startsWith("A")) {
                continue;
            }
            System.out.println(names[i]);
        }

        System.out.println("====================================");

        /*
        ARRAYS SIZE IS FIXED!!!
        size only:
        DataType[] name = new DataType [length]
         */

        int[] numbers = new int[5];

        System.out.println(numbers);

        numbers[3] = 25;
        numbers[0] = 100;
        numbers[3] = 300;

        System.out.println(Arrays.toString(numbers));

        System.out.println("=======================================");
        Scanner scan = new Scanner (System.in);
        System.out.println("How many names do you want to enter?");
        String [] students = new String [scan.nextInt()];

        scan.nextLine(); //to take out the Enter in scanner

        for(int i = 0; i<=students.length-1; i++){
            System.out.println("Enter a name");
            students[i] = scan.nextLine();

            /* to reverse
            for(int i = students.length-1; i>=0; i--){
            System.out.println("Enter a name");
            students[i] = scan.nextLine(); //ABC => CBA
             */
        }
        System.out.println(Arrays.toString(students));



    }
}
