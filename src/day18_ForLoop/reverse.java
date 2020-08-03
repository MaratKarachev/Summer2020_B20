package day18_ForLoop;

/*
write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
 */

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next(); //putting first character at the end:
        //Java ==> avaJ
        //Python ==>ythonP
        String s1 = str.substring(1);
        String s2 = str.substring(0, 1);
       // char  ch1=str.charAt(0); // char method
        String result1 = s1 + s2;
        System.out.println(result1); //ythonP

    }
}
