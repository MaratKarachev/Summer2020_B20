package Replits;

import java.util.*;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int length = word.length();

        if (length % 2 != 0 && length >= 3) {
            System.out.println(word.charAt(length / 2));
        }
        if (length == 1) {
            System.out.println(""+ word.charAt(0) + word.charAt(0) + word.charAt(0));
        }
        if (length % 2 == 0 && length>=4){
            System.out.println(""+ word.charAt(length/2-1)+word.charAt(length/2));
        }
        if(length==2){
            System.out.println(""+ word.substring(0,2)+ word.substring(0,2));
        }
    }
}