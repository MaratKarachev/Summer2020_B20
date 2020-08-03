package Replits;
import java.util.*;
public class FirstLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        //TODO: Write your code below
        //[ho, wy, by, ae, ne]
        String str="";
        for (String each : words) {
          str+= ""+each.charAt(0) + each.charAt(each.length() - 1)+",";
        }
            System.out.println(Arrays.toString(str.split(",")));
        }
    }


