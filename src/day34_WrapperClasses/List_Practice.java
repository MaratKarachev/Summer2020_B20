package day34_WrapperClasses;
/*
size(): returns the total number of elements
last index: size() - 1;
 */
import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        System.out.println(oddList.toString());
        System.out.println();
        System.out.println(evenList.toString());


        System.out.println("================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Apple");
        groceryList.add("Eggs");
        groceryList.add("Mango");
        groceryList.add("Ice Cream");

        for (int i = groceryList.size() - 1; i >= 0; i--) {
            System.out.print(groceryList.get(i) + "   ");
        }
        System.out.println();

        for(String each :groceryList){
            System.out.print(each + "   ");
        }




    }
}

