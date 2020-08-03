package Office_Hours.Practice_07_13_2020;

public class FrequencyOfChars {

    /*
    "JAVA";
    J1A2V1

    "DDEEEFFFF";
    D2E3F4

    Step1:
    remove duplicates "DEF"
    Frequency:        2 3 4
    combine:         D2E3F4
     */
    public static void main(String[] args) {

        String str = "OOPQQ"; //O2P1Q2
        String nonDup = ""; //"OPQ"

        //Remove Duplicates:

        for (int i = 0; i <= str.length() - 1; i++) {

            String s = "" + str.charAt(i); // O O P Q Q
            if (!nonDup.contains(s)) { // if the character is not already exist then we concat it to
                nonDup += s;
            }
        }

        String result = ""; //O2P1Q2


        // nonDup = "OPQ"   str =  "OOPQQ" ====>  O2P1Q2
        for (int j = 0; j <= nonDup.length() - 1; j++) {
            char ch1 = nonDup.charAt(j); //O
            int count1 = 0; //1+1 = 2
            for (int i = 0; i <= str.length() - 1; i++) {

                char each = str.charAt(i); // O O P Q Q
                if (each == ch1) {
                    count1 += 1;


                }
                result += "" + ch1 + count1;

            }
            System.out.println(result);

        }
    }
}

