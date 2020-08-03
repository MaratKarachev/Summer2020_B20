package Replits;
import java.util.*;

public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner (System.in);
        String item=scan.nextLine();
        boolean moreThan100$ = item.equals("Smartphone") || item.equals("Laptop");
        String result = "";
        String result1 = "Thank you for your purchase!";
        String result2 = "Your current balance is: ";
        String result3 = "Sorry, not enough funds on your gift card!";

        int giftCard = 100, charger = 15, usbCable = 10, headphones = 30, pants = 50, hat = 25, socks = 5, blanket = 60, pillow = 40;

        if (moreThan100$) {
            result = result3;
        } else if (item.equals("Charger")) {
            result = result1 + "\n" + result2 + (giftCard - charger) + "$";
        } else if (item.equals("USB cable")) {
            result = result1 + "\n" + result2 + (giftCard - usbCable) + "$";
        } else if (item.equals("Headphones")) {
            result = result1 + "\n" + result2 + (giftCard - headphones) + "$";
        } else if (item.equals("Pants")) {
            result = result1 + "\n" + result2 + (giftCard - pants) + "$";
        } else if (item.equals("Hat")) {
            result = result1 + "\n" + result2 + (giftCard - hat) + "$";
        } else if (item.equals("Socks")) {
            result = result1 + "\n" + result2 + (giftCard - socks) + "$";
        } else if (item.equals("Blanket")) {
            result = result1 + "\n" + result2 + (giftCard - blanket) + "$";
        } else if (item.equals("Pillow")) {
            result = result1 + "\n" + result2 + (giftCard - pillow) + "$";
        } else {
            System.out.println("Invalid item!");
        }
        System.out.println(result);
    }
}


