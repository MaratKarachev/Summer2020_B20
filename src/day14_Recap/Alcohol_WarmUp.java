package day14_Recap;

import java.util.Scanner;

public class Alcohol_WarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();


        if (age > 0 && age<120) {
            if (age >= 21) {
                System.out.println("Here is your wine");
            }else{
                System.out.println("get out kid");
            }
            }else {
            System.out.println("Invalid Entry");
        }
    }
}





