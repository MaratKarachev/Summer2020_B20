package Replits;

import java.util.Scanner;

public class Email2 {

/*
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com

craig_federighi@apple.com
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName, lastName, Domain, TopLevelDomain;
        int underScoreIndex, atSignIndex, dotIndex;

        underScoreIndex = email.indexOf("_");
        atSignIndex = email.indexOf("@");
        dotIndex = email.indexOf(".");

        firstName = email.substring(0, underScoreIndex);
        lastName = email.substring(underScoreIndex + 1, atSignIndex);
        Domain = email.substring(atSignIndex + 1, dotIndex);
        TopLevelDomain = email.substring(dotIndex + 1);

        System.out.println("First name: " + firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain: " + Domain);
        System.out.println("Top-Level Domain: " + TopLevelDomain);


    }
}

