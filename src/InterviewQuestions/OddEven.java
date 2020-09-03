package InterviewQuestions;

//write a custom method that will return odd or even numbers from int Array

import java.util.Arrays;

public class OddEven {

    public static String OddEven(int[] nums) {
        String odd = "";
        String even = "";
        for (int i = 0; i <= nums.length - 1; i++) { //for loop or for each loop would work.
            if (nums[i] % 2 == 0) {
                even += nums[i] + " ";
            } else {
                odd += nums[i] + " ";
            }
        }
        return "EVEN: " + even + "\nODD: "+odd;


    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println( OddEven(arr));
    }
}
