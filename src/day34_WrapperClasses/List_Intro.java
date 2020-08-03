package day34_WrapperClasses;
/*
ArrayList: part of collection
size is dynamic (automatically adjusted)
does not support primitive
has index numbers

methods:
add(Value): adds element
add(index, Value): adds the element to the specific index. no skipping of the indexes

get(index): gets the specific element from arrayList

 */

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95); //autoBoxing, index 0
        scores.add(100); //autoBoxing, index 2
        scores.add(85); //autoBoxing, index 3
        scores.add(75);//autoBoxing, index 4

        scores.add(1,65); // //autoBoxing, index 1, switching the numbers


        scores.add(5,55);

        System.out.println(scores);

        //100:
        System.out.println(scores.get(2));
    }
}
