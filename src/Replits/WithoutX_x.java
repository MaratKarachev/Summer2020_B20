package Replits;
import java.util.Scanner;
public class
WithoutX_x {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            //xHiX
            //0123

            if(word.startsWith("x") || word.startsWith("X")) {
                word = word.replace(word.substring(0,1), "");
            }else if(word.endsWith("x") || word.endsWith("X")){
                word = word.replace(word.substring(word.length()-1, word.length()), "");
            }

                System.out.println(word);

        }
    }

