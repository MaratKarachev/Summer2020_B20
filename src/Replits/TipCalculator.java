package Replits;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

                //WRITE YOUR CODE HERE
        int quality =0;
        System.out.println("Split:");
        String split = scan.next().toLowerCase();
        System.out.println("Number of people:");
        int people = scan.nextInt();
        System.out.println("Check amount:");
        double check = scan.nextDouble();
        System.out.println("Service Quality:");
        String service = scan.next().toLowerCase();
        switch (service){
            case "poor":
                quality = 5;
                break;
            case "fair":
                quality = 10;
                break;
            case "good":
                quality = 15;
                break;
            case "great":
                quality = 20;
                break;
            case "excellent":
                quality = 25;
        }
        String nump = "";
        for(int i =1; i<=people; i++){
            nump +="&";
        }
        if (split.equals("yes")){
            System.out.println("Number of people entered: "+ nump);
            System.out.println("Total to pay: "+(check+check*quality/100));
            System.out.println("Total tip: " + (check*quality/100));
            System.out.println("Total per person: " + (check+check*quality/100)/people);
            System.out.println("Tip per person: " + (check*quality/100)/people);
        }
            }
            }

