package day36_ArrayList;
/*
contains method
 */
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();

        list.addAll(Arrays.asList('A','A', 'B', 'B', 'C','C'));

        System.out.println(list);

       ArrayList<Character> nonDup = new ArrayList<>(); //{A,B,C}; after removing duplicates

        for(Character each :list){ //'A','A', 'B', 'B', 'C', 'C'
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);
    }
}
