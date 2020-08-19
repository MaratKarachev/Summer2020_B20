package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiAttack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        for (int j = 0; j < inhabitants.length; j++) {
            int sum = 0;
            System.out.println("Day " + (j) + " " + Arrays.toString(inhabitants));
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                sum += inhabitants[i];
            }
            if (sum == 0) {
                System.out.println("Day " + (j + 1) + " " + Arrays.toString(inhabitants));
                System.out.println("---- EXTINCT ----");
                break;
            }
        }

    }
}
