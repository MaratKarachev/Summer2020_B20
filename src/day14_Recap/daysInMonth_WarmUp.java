package day14_Recap;

import java.util.Scanner;

public class daysInMonth_WarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int monthNumber = input.nextInt();
        String result = "";

        boolean month = monthNumber >= 1 && monthNumber <= 12;

        if (month){
            if(monthNumber==2){
                result="28 days";
            }else if(monthNumber==4 || monthNumber==6 || monthNumber==9 || monthNumber==11){
                result="30 days";
            }else{
                result="31 days";
            }


        }else{
            result="Invalid";
        }
        System.out.println(result);
    }
}
