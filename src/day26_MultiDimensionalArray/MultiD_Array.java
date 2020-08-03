package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};
        //                 0    1      0    1    2     0    1     2    index
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        //                     0              1                2

        System.out.println(Arrays.toString(ch2D[0]));
        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(Arrays.toString(ch2D[2]));

        //to print 'H'

        System.out.println(ch2D[2][2]);


        //print 'C'
        System.out.println(ch2D[1][0]);

        //print 'G' 'B'

        System.out.println(ch2D[2][1] + " " + ch2D[0][1]);

        System.out.println("=====================================");

        //{1,2,3} , {4}, {5,6}, {7,8,9,10}

        //  int [] arr1D = { {1,2,3} };

        int[][] nums = {{1, 2, 3}, {4}, {5, 6}, {7, 8, 9, 10}};
        //                0         1      2           3


        //  [7,8,9,10]
       // System.out.println(Arrays.toString(nums[3]));


        /*
        {1, 2, 3}
        {4}
        {5, 6}
        {7, 8, 9, 10}
         */

        /*NOTES:
        Arrays.deepToString(array): converts multi-D array to String
        Arrays.toString(array):converts 1D or regular array
         */

        for(int i =0; i<=nums.length-1; i++){
            System.out.println(Arrays.toString(nums[i]));
        }

        System.out.println(Arrays.deepToString(nums));
/*
        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));
        System.out.println(Arrays.toString(nums[3]));
 */
    }
}
