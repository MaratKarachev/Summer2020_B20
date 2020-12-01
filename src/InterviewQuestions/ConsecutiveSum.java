package InterviewQuestions;

public class ConsecutiveSum {

    /*
    1.Java coding challenge.

Given the following method signature,

int MaxWindowTotal(int[] values, int windowSize);

MaxWindowTotal will take an array of integers and a window size, and return the maximum total of any

consecutive sequence of integers of length windowSize.

For example, given (array =  [5, 12, 25, 7, 9], window size = 3), the method will return 44 (the sum of 12,

25, and 7 is the greatest total of any 3 consecutive integers in the array).

You can not use any ready libraries or methods. I completed it with nested

loops he asked me to try to do it without having nested loops.
     */

    public static int maxWindow(int[] arr, int windowSize) {
    int sum = 0;
    for(int i = 0;
    i <=arr.length-windowSize;i++)

    {
        int k = windowSize;
        int c = i;
        int f = 0;
        while (k != 0) {
            f += arr[c];
            k--;
            c++;
        }
        if (f > sum) {
            sum = f;
        }
    }
return sum;
}
}

