package day23_Arrays;

public class MaxMin {
    public static void main(String[] args) {
        // int[] arr = {10, 20, 3,4,5,6,7-10,-100,300,400};
        // write a program that can return the min and max number from the array


        int[] arr = {5, 5, 4, 2, 4, 1, -100, 100,200,3000,-3000};
        int max = arr[0]; // 5
        int min = arr[0]; // 5

        for (int i = 1; i <= arr.length - 1; i++) { //i: 1,2,3,4,5

            if (arr[i] > max) { // compares the arrays elements and assigns the max number to variable max.
                max = arr[i];
            }
            if (arr[i] < min) { // compares the arrays elements and assigns the min number to variable min.
                min = arr[i];
            }

        }


        System.out.println("Max Number: " + max);
        System.out.println("Min number: " + min);


        //int[] num = {10, 20, 3, 4, 5, 6, 7, -10, -100, 300, 400};


    }
}
