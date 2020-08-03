package day11_NestedIf_Ternary;

public class NestedIf_Practice2 {
    public static void main(String[] args) {

        /* Task 02
            1 Monday
            2 Tuesday
            3 Wednesday
            ...
            7 Sunday
            invalid ==> there is no such a day
         */

        int day = 4;
        boolean validNumber = day >= 1 && day <= 7;
        String result = "";

        if (validNumber) {
           /* if (day == 1) {
                result = "Monday";
            } else if (day == 2) {
                result = "Tuesday";
            } else if (day == 3) {
                result = "Wednesday";
            } else if (day == 4) {
                result = "Thursday";
            } else if (day == 5) {
                result = "Friday";
            } else if (day == 6) {
                result = "Saturday";
            } else {
                result = "Sunday";
            }
            System.out.println(result);
         */

            result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" : (day == 4) ? "Thursday"
                    : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday";

        } else {// invalid number
            result = "there is no such a day";}

            System.out.println(result);
        }
    }
