package Replits;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int x = i; x <= n; x++) {

            for (int y = j; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
