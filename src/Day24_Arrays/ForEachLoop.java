package Day24_Arrays;

/*
Data Structures:
1.Array
2.Collection
3.Map

int[] arr = {1,2,3};

for(int i=0; i<=arr.length-1; i++){

}

for each loop: a loop that's already iterated. Starting from index 0 till the end of data structure.
Order is fixed.
We MUST have data structure to use for each loop.

for (DataType each: Collection Of Data){

}

each: represents every single elements in Collection
DataType: MUST match with Array's DataType

 */

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2, -3};

        for (int i = 0; i <= arr.length - 1; i++) { // i - is the index number
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("============================");


        for (int each : arr) { // each - represents the elements

            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("=====================");


        String[] arr1 = {"Marat", "Hasan", "Alena", "Elmira", "Jesus", "Hakan", " Ilya", "Hanna",};

        for (String each : arr1) {

            System.out.print(each + " ");

        }

    }
}
