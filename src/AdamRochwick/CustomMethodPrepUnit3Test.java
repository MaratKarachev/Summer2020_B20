package AdamRochwick;

import java.util.Arrays;
import java.util.Scanner;

public class CustomMethodPrepUnit3Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //We are going to create a custom method
        //uses an array to count through user inputed numbers
        //print the highest, and lowest entered number

        System.out.println("Length of array: ");
        int l = scan.nextInt();
        HighLowMethod(l);
    }
    public static void HighLowMethod (int l) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[l];
        for(int i = 0; i <= numbers.length - 1; i++){
            System.out.println("Enter numbers for array: ");
            int populate = scan.nextInt();
            numbers[i] = populate;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int a = 0; a <= numbers.length - 1; a++){
            if(max < numbers[a]) {
                max = numbers[a];
            }
            if(min > numbers[a]) {
                min = numbers[a];
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}