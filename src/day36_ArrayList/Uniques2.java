package day36_ArrayList;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>(); //{1,1,2,3,3}

            list.add(1);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(3);
            list.add(4);


            ArrayList<Integer> uniques = new ArrayList<>();


            for(Integer each : list){

                int count = Collections.frequency(list,each);

                if (count == 1) {
                    uniques.add(each);
                }
            }

            System.out.println(uniques);

            /*
            Task:
             1. write a program that can find the unique characters from a String
            Do not use nested loop

            "ABABCDEE"
            output: CD

            2. write a program that can find the frequency of character from a String
            "AABBCCDDEE"
            output: A2B2C2D2E2
            first remove duplicates to get ABCDE
            use frequency and concat both;

             */

        ArrayList<String> unique = new ArrayList<>();


        }
    }

