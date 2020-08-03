package day35_ArrayList;
/*
 1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */

import java.util.ArrayList;

public class ReverseOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);//index # 0
        list.add(20);//index # 1
        list.add(30);//index # 2
        list.add(40);//index # 3
        list.add(50);//index # 4

        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            list.get(i);
            System.out.print(list.get(i)+" ");
        }
    }
}
