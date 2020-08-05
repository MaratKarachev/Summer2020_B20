package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {

    //    ArrayList Methods: add, remove, size, set, get, equals, contains, clear
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //remove method - removes only one element (first one)
        cars.addAll(Arrays.asList("BMW", "Mercedes", "Infiniti", "Tesla", "VW", "Lamborghini", "Lexus", "Tesla",
                "Tesla", "Mazda"));
        //                          0           1        2          3        4           5          6      7        8

       //  cars.remove(3); one way to remove one of the cars
       //  cars.remove("Tesla"); another way to remove one element
        // cars.removeAll(Arrays.asList("Tesla")); // removes all the matching elements
        //cars.removeIf(p->p.toLowerCase().contains("m"));
        // cars.retainAll(Arrays.asList("Tesla"));

        System.out.println(cars);

        System.out.println("=====================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Paper Towel", "Toilet paper", "Mango", "Orange", "Avocado", "Dragon fruit"));


        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);

        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs", "Milk", "Orange", "Water"));
        System.out.println(groceryList);
        System.out.println(r2);

        System.out.println("Total Number of Items: "+groceryList.size());

        //set the dragon fruit to apple:

        groceryList.set(groceryList.size()-1, "Apple");
        groceryList.set(groceryList.indexOf("Paper Towel"),"Dishwasher");

        System.out.println(groceryList);

        groceryList.clear();

        System.out.println(groceryList);


    }
}
