package Replits;
import java.util.*;
public class FrontPiece {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        for (int i = 0; i < size; i++) {
            if (size < 2) {
                System.out.println(Arrays.toString(num));
            } else {
                System.out.println("" + "[" + num[0] + ", " + num[1] + "]");
                break;

            }
        }
    }
}

