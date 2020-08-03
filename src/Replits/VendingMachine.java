package Replits;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter price in cents: ");
        int itemPrice=scan.nextInt();
        int quarters=25;
        int dimes=10;
        int nickels=5;

        if(itemPrice <= 100 && itemPrice >= 25 && itemPrice%5==0){
            quarters = (100-itemPrice)/25;
            dimes = (100-itemPrice)%25/10;
            nickels = (100-itemPrice)%25%10/5;
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
        }else {
            System.out.println("Invalid price!");
        scan.close();
        }
    }
}
