package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArrays3 {
    public static void main(String[] args) {
        String[] a1 = {"Tetiana", "Hamit", "Phornsri"}; //i:0,1,2
        String[] a2 = {"Aaloa", "Zaki", "Christina", "Dawut"}; //i:0,1,2,3

        String[] students = new String[a1.length + a2.length];

        for (int i = 0; i <= a1.length - 1; i++) {
            students[i] = a1[i];
        }
        for (int i = 0; i <= a2.length - 1; i++) {
            students[i+3] = a2[i]; //+3 because it is the length of the first array a1.
        }

        System.out.println(Arrays.toString(students));

    }
}
