package Office_Hours.Practice_08_25_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);

        Integer [] nums = {80,90,100};
        Integer [] nums2 = {80,90,100,90};

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.addAll(Arrays.asList(50,60,70));
        // list2.addAll(Arrays.asList(nums)); //Collection does not support primitives
        list2.addAll(Arrays.asList(nums2));

        System.out.println(list2);

       // list2.remove(8);// the index

        /*
        list2.remove(new Integer(90));
        list2.remove(new Integer(30));
        list2.remove(new Integer(70));

         */

        list2.removeAll(Arrays.asList(30,70,90));

        list2.removeIf(p->p>50);
            System.out.println(list2);


        System.out.println(list2);
    }
}
