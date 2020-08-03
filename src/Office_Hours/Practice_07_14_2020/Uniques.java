package Office_Hours.Practice_07_14_2020;

public class Uniques {

    /*
    Tasks:
    finding the uniques
    unique: frequency is 1
     */
    public static void main(String[] args) {

        String str = "ABABCDDEFFGJJIJJK";
        String expectedResult = "";     //"C"

        //str = "ABABC";

        for(int j=0; j<=str.length()-1;j++){
            char ch = str.charAt(j); //"A"
            int count = 0; //frequency of ch variable
            for(int i = 0; i<=str.length()-1; i++) { //helps us to calculate the frequency of ch and assign to count
                char each = str.charAt(i);
                if (each == ch) {
                    count += 1;
                }
            }

            if(count==1){ // unique
                expectedResult+=ch;
            }
        }

        System.out.println(expectedResult);
    }
}
