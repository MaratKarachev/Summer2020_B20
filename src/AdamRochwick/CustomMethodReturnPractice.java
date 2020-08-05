package AdamRochwick;

import java.util.Arrays;
import java.util.Scanner;

public class CustomMethodReturnPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //we want to take user input use custom method with return to combine 2 arrays, return one big array

        System.out.println("Enter length of first array: ");
        int a = scan.nextInt();

        System.out.println("Enter length of second array: ");
        int b = scan.nextInt();

        int [] arr1 = new int [a];
        for(int i = 0; i <= arr1.length - 1; i++){
            System.out.println("Enter numbers for array: ");
            int populate = scan.nextInt();
            arr1[i] = populate;
        }

        int [] arr2 = new int [b];
        for(int i = 0; i <= arr2.length - 1; i++){
            System.out.println("Enter numbers for array: ");
            int populate = scan.nextInt();
            arr2[i] = populate;
        }


        System.out.println(Arrays.toString(combine2Arrays(arr1,arr2)));
    }

    public static int [] combine2Arrays(int [] arr1, int [] arr2){ //arr1 5 len | arr2 10 len
        int [] arr3 = new int[arr1.length + arr2.length];

        int a = 0;
        for(int each: arr1){
            arr3[a] = each; //3,12,6,32,0
            a++;
        }
        for(int each: arr2){
            arr3[a] = each;
            a++;
        }
        return arr3;
    }

    }

