package day14_Recap;

import java.util.Scanner;

public class Tax_WarmUp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your annual salary: ");
        int salary=input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();
        System.out.println("Are you married? ");
        boolean marriedStatus=input.nextBoolean();
        if(marriedStatus==true){
            double singleSalaryAfterTax=salary/100*25;
        }else{
            double marriedSalaryAfterTax=salary/100*20;
        }

        System.out.println(marriedStatus);

    }
}
