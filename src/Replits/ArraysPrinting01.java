package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting01 {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            String[] arr = new String[5]; //index 0,1,2,3,4
            for (int i=0;i<5;i++)
            {
                arr[i] = input.nextLine();
            }
            //leave above alone! :)
            //assume you have String array of 5 items

            //write your code below:
        for(String each : arr){
            System.out.println(each.substring(0,3));
        }
        }
    }


