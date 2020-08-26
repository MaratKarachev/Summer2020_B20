package AdamRochwick;

import java.util.Arrays;
import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        /*
        user inputed array for size and elements,
        custom method for array, so we can re-use it.
        return values as a String.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        System.out.println(Arrays.toString(name(size)));
    }

    public static String[] name(int size) {

        Scanner scan = new Scanner(System.in);

        String[] name = new String[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Enter the names:");
            String name1 = scan.nextLine();
            name[i] = (name1);
        }
        return name;


    }
}

