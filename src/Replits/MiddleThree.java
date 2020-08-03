package Replits;
import java.util.*;
public class MiddleThree {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //YOUR CODE HERE
            int length = word.length();
            if (length % 2 != 0 && length >= 5) {
                System.out.println("" + word.charAt(length / 2 - 1)+word.charAt(length / 2) + word.charAt(length / 2 + 1));
            } else {
                System.out.println("invalid");
            }
        }
        }
