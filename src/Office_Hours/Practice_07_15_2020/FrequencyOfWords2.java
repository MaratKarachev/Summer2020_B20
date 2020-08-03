package Office_Hours.Practice_07_15_2020;

import java.util.Scanner;

public class FrequencyOfWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine().toLowerCase();

       // to convert string to lower case:  str = str.toLowerCase(); or option above.

        int count = 0;
        while(str.contains("java")){
            str = str.replaceFirst("java","");
            count++;

        }
        System.out.println(count);

    }
}
