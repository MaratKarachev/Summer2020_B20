package day36_ArrayList;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        /*
        indexOf()
        lastIndexOf()
        contains()
        equals()
        isEmpty()
         */


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);//0
        list.add(20);//1
        list.add(30);//2
        list.add(40);//3
        list.add(50);//4
        list.add(40);//5

        int a = list.indexOf(40);

        System.out.println(a); //index 3

        System.out.println((list.indexOf(60))); //60 does not exist in the list ==>-1

        System.out.println(list.lastIndexOf(40)); //index 5

        boolean r1 = list.contains(100); //contains

        System.out.println(r1);

        System.out.println("=========================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cybertek School");


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));

        System.out.println("=========================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);

        System.out.println(list3.isEmpty());
    }
}
