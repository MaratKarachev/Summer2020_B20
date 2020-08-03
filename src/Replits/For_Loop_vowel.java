package Replits;
import java.util.Scanner;

public class For_Loop_vowel {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        //a, e, i, o, u

        String newword = "";

        for (int i = 0; i < word.length(); i++) {  // 0 1 2 3 4 5 6
            // if(word.substring(i, i+1).equals("a") ||
            //   word.substring(i, i+1).equals("e") ||
            //   word.substring(i, i+1).equals("i") ||
            //   word.substring(i, i+1).equals("o") ||
            //   word.substring(i, i+1).equals("u")) {
            //   newword += word.substring(i, i+1);
            if (word.charAt(i) == 'a' ||
                    word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' ||
                    word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u') {


                newword += word.charAt(i);
            }
        }

        System.out.println(newword);
    }
}
