package Replits;

import java.util.Scanner;

public class LaptopConfigurator {

    /*
    First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price.
    If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  17.3 -
    add  $400 to the laptop price.  Then ask user for CPU type. If CPU type equals to i3, add  $150 to the
    laptop price. If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350
     to the laptop price. Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then,
     ask user for storage type. There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for
     every 500gb.  If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution.
     There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
     */

    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double size = scan.nextDouble();
        if (size == 13.3) {
            price += 200;
        } else if (size == 15.0) {
            price += 300;
        } else if (size == 17.3) {
            price += 400;
        }
        System.out.println("Select CPU type:");
        String CPU = scan.next();
        if (CPU.equals("i3")){
            price += 150;
        } else if (CPU.equals("i5")) {
            price += 250;
        } else if (CPU.equals("i7")) {
            price += 350;
        }

        System.out.println("Select RAM size:");
        int RAM = scan.nextInt();
            price += (RAM / 4) * 50;

        System.out.println("Select storage type:");
       String storage = scan.next();
        System.out.println("Enter memory size:");
        int memory = scan.nextInt();
        if (storage.equals("HDD")) {
            price += (memory / 500) * 50;
        }
        if (storage.equals("SSD")) {
            price += (memory / 500) * 100;
        }

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        if (resolution.equals("FULLHD")) {
            price += 100;
        }
        if (resolution.equals("4K")) {
            price += 200;
        }

            System.out.println("Laptop price is: "+"$"+price);

        }
    }

