package day10_IfStatements;

public class Character_Identify {
    public static void main(String[] args) {
        //TASK#1

        char character = '@';
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //                     upper case letters                   ||       lower case letters
        // 48<=CHARACTER<=47

        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar = isAlphabetic == false && isDigit == false;


        String alphabet = "";

        if (isAlphabetic == true) {
            //  System.out.println(character+ " is alphabetic character");
            alphabet = character + " is Alphabetic character";
        } else {
            //  System.out.println(character + " is not alphabetic character");
            alphabet = character + " is not Alphabetic character";
        }
        System.out.println(alphabet);

        System.out.println("=======================");

        //TASK#2

        String digit = "";

        if (isDigit == true) {
            digit = character + " is a digit";

        } else {
            digit = character + " is not a digit";

            System.out.println(digit);
        }

        System.out.println("======================");

        //TASK#3

        String specialCharacter = "";
        if (specialChar == true) {
            specialCharacter = character + " is a special character";

        }else{
            specialCharacter = character + " is not a special character";
        }
        System.out.println(specialCharacter);


    }
}
