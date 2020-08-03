package Replits;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your vehicle's year:");
        int vehicleYear = scan.nextInt();
        String result = "";


        if (vehicleYear >= 1995 && vehicleYear <= 1998 || vehicleYear >= 2001 && vehicleYear <= 2002 || vehicleYear >= 2004 && vehicleYear <= 2006
                || vehicleYear >= 2015 && vehicleYear <= 2017) {
            result = "Your vehicle needs to be recalled!";
        } else {
            result = "Your vehicle is fine, enjoy";
        }
        System.out.println(result);
    }
}
