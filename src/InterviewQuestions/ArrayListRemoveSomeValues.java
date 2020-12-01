package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveSomeValues {
    public static void main(String[] args) {


        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 100, 102, 3000, 70000, 1000000, -20));
            numList.removeIf(p->p>100);
        System.out.println(numList);
    }
}