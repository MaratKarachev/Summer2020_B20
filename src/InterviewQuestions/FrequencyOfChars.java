package InterviewQuestions;

public class FrequencyOfChars {
    public static void main(String[] args) {


        /*
        Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
        String str = "AAABBCDD";
        String nonDup = "";
        //declare an empty String named NonDup to store all non duplicate chars.


        for (int i = 0; i < str.length(); i++)
        // using for loop to make sure we run through every single char of the String
            if (!nonDup.contains("" + str.charAt(i)))
                // using if condition to make sure that NonDup String does not contain duplicated chars

                nonDup += "" + str.charAt(i);//// ABCD
            // we are adding non duplicated chars into nonDup String.



        String expectedResult = "";
        //declaring a new empty String, to combine the count of chars with each non dup char.

        for (int j = 0; j < nonDup.length(); j++) { // runs the loop 4 times
            //using for loop
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == nonDup.charAt(j)) // "AAABBCDD" == ABCD counting the frequency of the each char

                    count++; // increases by 1 every time i=j

            }

            expectedResult += nonDup.charAt(j) + "" + count;

        }
        System.out.println(expectedResult);// A3B2C1D2



    }


}
