package Replits;
import java.util.Scanner;

public class PrintHalfTwice {


            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String word = scan.next();
                int length=word.length();


                String firstHalf=(""+ word.substring(0,length/2));
                System.out.println(firstHalf+firstHalf);
    }
}
