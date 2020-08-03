package day12_Switch_Scanner;

        /*
        write a program that can print out the name of the month based on the number
        ex:
        1
        output: "Jan"
        DO NOT use If & Ternary
         */

public class Task1 {
    public static void main(String[] args) {
        int num=5;
        String result="";

        switch (num) {
            case 1:
                result="January";
                break;
            case 2:
                result="February";
                break;
            case 3:
                result="March";
                break;
            case 4:
                result="April";
                break;
            case 5:
                result="May";

            case 6:
                result="June";

            case 7:
                result="July";
                break;
            case 8:
                result="August";
                break;
            case 9:
                result="September";
                break;
            case 10:
                result="October";
                break;
            case 11:
                result="November";
                break;
            case 12:
                result="December";
                break;
            default:
                result="no such month";
        }
        System.out.println(result);

    }
}
