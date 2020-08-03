package Replits;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrintin02 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[8];
            for (int i = 0; i < 8; i++) {
                arr[i] = input.nextLine();
            }
            //leave above alone! :)
            //assume you have String array of 8 items
            //and print two items at a time in 4 line
            //write your code below
            System.out.print(arr[0]);
            System.out.println(arr[1]);
            System.out.println();
            System.out.print(arr[2]);
            System.out.println(arr[3]);
            System.out.println();
            System.out.print(arr[4]);
            System.out.println(arr[5]);
            System.out.println();
            System.out.print(arr[6]);
            System.out.println(arr[7]);
        }
        }
