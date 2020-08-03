package day13_Scanner;
/*3. write a program that asks the user to enter:
                        1. building number
                        2. street name (assume it has one word only)
                        3. road name (assume it has one word only)
                        4. city name (assume it has one word only)
                        5. state
                        6. zipcode
            and then print out the full address
                ex:
                    input:
                            7925
                            JonesBranch
                            Dr
                            McLean
                            VA
                            22000
                    output:
                        address:    7925 JonesBranch Dr, McLean VA, 22000 */

import java.util.Scanner;

public class WarmUpTasksBeforeBed3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name: ");
        String streetName = scan.next();
        System.out.println("Enter your road name: ");
        String roadName = scan.next();
        System.out.println("Enter your city name: ");
        String cityName = scan.next();
        System.out.println("Enter your state: ");
        String state = scan.next();
        System.out.println("Enter your zipcode: ");
        int zipCode = scan.nextInt();

        String address = "address: " + buildingNumber + " " + streetName + " " + roadName + ", " + cityName + " " + state + " " + zipCode;
        System.out.println(address);


    }
}
