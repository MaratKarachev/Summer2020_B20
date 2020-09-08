package day38_JavaRecap;

 /*
    Java recap:
    Arrays class: Arrays.asList(); takes array values and returns CollectionType

    ArrayList Methods: add, remove, size, set, get, equals, contains, clear

    Bulk Operations:
    removeAll(CollectionType) - removes multiple elements
    addAll(CollectionType) - adds multiple elements
    retainAll(CollectionType) - removes all the NOT matching elements )only keeps the matching elements)
    containAll(CollectionType) - checks if the elements are contained

    Predicate: removeIf - removes all the elements that are matching with the condition

    Collection Person:
    Collections.sort()
    Collections.swap()
    Collections.frequency()
    Collections.max()
    Collections.min()
    Collections.replaceAll()

   */

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 90, 85, 81, 82, 75, 55, 45, 73, 73, 35, 47, 60, 87, 77, 67, 57, 47, 93, 83, 73, 62, 64, 67, 63, 53, 43));

        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>();//90-100
        gradeA.addAll(list); //first store all the grades
        gradeA.removeIf(each -> each < 90); //second remove the grades that are not A. Only the grade of A will be retained
        System.out.println("Grade A: " + gradeA);


        ArrayList<Integer> gradeB = new ArrayList<>();//80-89
        gradeB.addAll(list);
        gradeB.removeIf(p -> p < 80 || p > 89);
        System.out.println("Grade B: " + gradeB);


        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf(c -> c < 70 || c > 79);
        System.out.println("Grade C: " + gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf(d -> d < 60 || d > 69);
        System.out.println("Grade D: " + gradeD);


        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(f -> f > 59);
        /*
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);

         */
        System.out.println("Grade F: " + gradeF);

        System.out.println("===================================================");
        System.out.println(gradeA.size() + " students made A");
        System.out.println(gradeB.size() + " students made B");
        System.out.println(gradeC.size() + " students made C");
        System.out.println(gradeD.size() + " students made D");
        System.out.println(gradeF.size() + " failed");


    }
}
