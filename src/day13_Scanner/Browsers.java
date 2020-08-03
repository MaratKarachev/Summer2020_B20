package day13_Scanner;

import java.util.Scanner;

/*
write a program that can display the selected browser
            1.1  declear a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary
Collapse
 */
public class Browsers {
    public static void main(String[] args) {
        String browserName="firefox";
        //boolean, long, double and float are not accepted in switch

        switch(browserName){
            case "chrome":
                System.out.println("Opening Chrome Browser");


            case "firefox":
                System.out.println("Opening Firefox Browser");

            case "opera":
                System.out.println("Opening Opera Browser");

            case "safari":
                System.out.println("Opening Safari Browser");

            case "edge":
                System.out.println("Opening Edge Browser");


            default:
                System.out.println("Invalid Browser");

        }

    }
}
