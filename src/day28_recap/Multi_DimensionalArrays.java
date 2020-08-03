package day28_recap;

import java.util.Arrays;

/*
// Multi_DimensionalArrays:
each array and each element has index number
n dimensional array contains (n-1)dimensional array
2D array: contains 1D arrays
[index
Arrays.deepToString():for multi D arrays only

 */
public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3};
        //                 0 1 2     0  1  2  3  4    0   1   2  3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        // index             0           1                2

        //{4,5,6,7,8}

        System.out.println(Arrays.toString(arr2D[1])); //single dimensional int array

        System.out.println(Arrays.deepToString(arr2D));

        //7 (index 1 and 3)
        System.out.println(arr2D[1][3]);

        System.out.println("=============================================");

        for (int i = 0; i <= arr2D.length - 1; i++) { // iterates each 1D array from arr2D
            int[] each1DArray = arr2D[i];
            //  System.out.println(Arrays.toString(each1DArray));

            for (int j = 0; j <= each1DArray.length - 1; j++) { //iterates the elements of each 1D array
                int eachNum = each1DArray[j];
                if (eachNum % 2 == 0) {

                    System.out.print(eachNum + " ");
                }
            }
            System.out.println();

        }

        System.out.println("=============================================");

        for (int[] each1D : arr2D) {
            for (int eachElement : each1D) {
                if (eachElement % 2 != 0) {
                    System.out.print(eachElement + " ");
                }
            }
            System.out.println();
        }
    }
}
