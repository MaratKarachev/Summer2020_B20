package Replits;

import java.util.*;

public class addElements {


    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] ints3 = new int[5];

        for (int i = 0; i < 5; i++) {
            ints3[i] = ints1[i] + ints2[i];
        }
        return ints3;
    }
}

