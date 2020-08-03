package day28_recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word  = scan.next();

        //(0,3)

        int count = 0;
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equalsIgnoreCase("cat")) {
                count++;

            }
        }
        System.out.println(count);

    }
}
