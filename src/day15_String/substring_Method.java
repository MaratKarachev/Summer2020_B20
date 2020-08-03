package day15_String;

public class substring_Method {
    public static void main(String[] args) {
        /*substring(): creates the subString of the String:
        1. substring(beg index, ending index):creates the substring from the beginning index till the ending index
        */

        String sentence = "Java is fun";
        //                 012345678910..

        String word1 = sentence.substring(0, 4); // Java
        System.out.println(word1);

        String word2 = sentence.substring(8, 11);
        System.out.println(word2);

        System.out.println("====================================");

        String sentence2 = "I like Movies and TV series";
        //                   012345678910111213....
        String word3 = sentence2.substring(7, 12 + 1);
        System.out.println(word3);

        System.out.println("====================================");

        String firstName = "MArAT";
        //                  01234
        String firstCharacter = firstName.substring(0, 1);
        String rest = firstName.substring(1, firstName.length()); // means lastIndex+1
        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstCharacter);
        System.out.println(rest);

        System.out.println(firstName);

        /* 2. substring(beg): creates substring from beginning index till the end of String
        "Muhtar".substring(1); ==> uhtar
         */

        System.out.println("====================================");

        String lastName = "MaRAt";
        String firstChar = lastName.substring(0, 1); // s
        String remaining = lastName.substring(1); //chool

        System.out.println(firstChar);
        System.out.println(remaining);

        lastName = firstChar.toUpperCase() + remaining.toLowerCase();
        System.out.println(lastName);

        System.out.println("====================================");

        String sentence3 = "I like Game of Thrones";
        //             0123456789.....
        String series = sentence3.substring(7);
        System.out.println(series);

        System.out.println("====================================");
        String sentence4 = "I like Java Programming Language";
        //                0123456789....
        String language = sentence4.substring(7);
        System.out.println(language);


    }
}
