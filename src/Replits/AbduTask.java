package Replits;

import java.util.Scanner;

public class AbduTask {

    /*
    12345
    1234
    123
    12
    1

    *****
    ****
    ***
    **
    *

     */

    public static void main(String[] args) {
        int s = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= s) {

                    System.out.print(s);
                }
            }
            s--;
            System.out.println();
        }


        System.out.println("==========================");
        /*
         ********
         *   *
         *   *
         *   *
         *****
         *****
         *****
         */

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i <= 5 && i >= 1) && (j <= 3 && j >= 1)) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    }




