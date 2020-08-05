package Replits;
import java.util.*;
public class MakeLast {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();

            int[]result = new int[size*2]; //multiplying by2 to double the size
            result[size*2-1] = nums[size-1]; // assigning the last index of first result to second
            System.out.println(Arrays.toString(result));

        }

    }
}
