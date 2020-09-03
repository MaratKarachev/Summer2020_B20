package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class ConcatTwoArrays {
    public static int [] ConcatTwoArrays (int [] a1, int [] a2) {// [1,2,3] [4,5,6]
        int[] result = new int[a1.length + a2.length]; //[0,0,0,0,0,0] we are adding the length of the first array  to
        //the length of the second array to store the total length in array result.
        int i = 0;
        for(int each:a1){ // using for each loop to store every single element of the a1 into each
            result[i]=each; // [1,2,3,0,0,0]
            i++;
        }
        for(int each:a2){ // using for each loop to store every single element of the a2 into each
            result[i]=each;// [1,2,3,4,5,6]
            i++;
        }
        return result; //[1,2,3,4,5,6] returns the result of a1 and a2
    }

    public static void main(String[] args) {
        int [] a1 = {1,2,3};
        int [] a2 = {4,5,6};

        System.out.println(Arrays.toString(ConcatTwoArrays(a1,a2))); //[1,2,3,4,5,6] Need to use Arrays.toString, then call method
    }

}
