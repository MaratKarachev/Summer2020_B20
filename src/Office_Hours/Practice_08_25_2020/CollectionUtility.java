package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    /*
    Collections Utility:
    swap:
    sort:
    max:
    min:
    frequency:
     */

    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,10,10,10));
        //                          0  1  2  3  4  5  6  7  8
        // Collections.swap(list1,0,1); // swapping first and second index
        // Collections.swap(list1,7,8);
        Collections.swap(list1, list1.size()-2, list1.size()-1); //swapping last index with second last
        System.out.println(list1);

        Collections.sort(list1);

        System.out.println(list1);

        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);

        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

        Integer frequency = Collections.frequency(list1,10);

        System.out.println("Frequency of 10: "+frequency);

        System.out.println("================================");

        String [] arr = {"Eggs", "Orange", "Milk", "Milk", "Toilet Paper", "Toilet Paper", "Toilet Paper","Toilet Paper","Avocado"};

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList(arr));
        System.out.println(items);

        int count = Collections.frequency(items,"Toilet Paper");

        System.out.println("Frequency of Toilet Paper: "+count);

        items.removeIf(I->Collections.frequency(items,I) ==1); // removes the unique items
        items.removeIf(I->Collections.frequency(items,I) !=1); // removes the non-unique items

        System.out.println(items);



    }
}
