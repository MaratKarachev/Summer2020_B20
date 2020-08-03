package Replits;
import java.util.*;

public class ArraysPrintFirstAndLast {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

            // leave above code alone :)
            // assume you have String array of 5 items
            //and print firt and last char of each items in one line

            //TODO: Write your code

            for(String each: words){
                System.out.println(""+each.charAt(0)+(each.charAt(each.length()-1)));
            }

        }

        }
