package day12_Switch_Scanner;

public class Switch_Scanner {
    public static void main(String[] args) {
        /* Switch does not accept, boolean, double, long and float (unless you cast, which no point to do)
        long c=10; //10L
        float f=10; //10f
        double d=10; // 10.0
        boolean
        */

        int num = 7;
        String result="";

        switch (num) {
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result="Wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            default:
               result="Invalid case";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
        }
        System.out.println(result);

    }
}