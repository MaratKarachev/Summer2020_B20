package Office_Hours.Practice_08_24_2020;

import java.util.*;

public class Array_Recap {
    public static void main(String[] args) {
        /*
        Array
        Collection
        Map

        Arrays Utility:
        toString
         */

        int[] arr1 = new int[5]; // index:  0,1,2,3,4
        // System.out.println(arr1); will give us hashcode
        arr1[0] = 10;
        arr1[arr1.length - 1] = 20;
        //5-1 = 4
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        //             0 1 2 3 4
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr2[4] * arr2[1]);
        //                    5   * 2
        System.out.println(arr2[0] * arr2[4]);
        //                    1   *  5

        System.out.println("=======================================");

        Scanner scan = new Scanner(System.in);
        String[] names = new String[5]; // index: 0,1,2,3,4

        for (int i = 0; i<=names.length-1; i++) { // i represents index's

            System.out.println("Enter a name");
            names[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}
