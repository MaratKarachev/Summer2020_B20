package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
        String str1="abdc";
        String str2="cabh";
        char[] ch1=str1.toCharArray();  //{a,b,d,c}
        char[] ch2=str2.toCharArray();  //{c,a,b,d}
        String str1Sorted="";
        String str2Sorted="";
        Arrays.sort(ch1);   //{a,b,c,d}
        Arrays.sort(ch2);   //{a,b,c,d}
        for (char each:ch1){
            str1Sorted+=each;   //"abcd"
        }
        for (char each:ch2){    //"abcd"
            str2Sorted+=each;
        }
        System.out.println(str1Sorted.equals(str2Sorted));  //"abcd"=="abcd" -->true


        System.out.println("=======================================");

        ArrayList<String> countries = new ArrayList<>();

        countries.addAll(Arrays.asList("America", "England", "Australia", "New Zeland", "Russia", "Canada"));

       //  countries.removeIf(c->c.endsWith("a"));
        countries.removeIf(c->c.charAt(c.length()-1)=='a');
        System.out.println(Arrays.asList(countries));
    }
}


