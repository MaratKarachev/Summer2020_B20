package Replits;

import java.util.*;

public class SMSmessage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        //Mike Smith  2 0 2 - 1 1 2 3 - 3 4 5 6 I   l o v e programing and problem solving
        //01234567891011121314151617181920212223242526272829
        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring((message.indexOf('<') + 1), message.indexOf('>'));
        System.out.println("Sender: " + sender);
        phoneNumber = message.substring(message.indexOf('[') + 1, message.indexOf(']'));
        System.out.println("Phone Number: " + phoneNumber);
        messageBody=message.substring(message.indexOf('{')+1, message.indexOf('}'));
        System.out.println("Message body: "+ messageBody);


    }
}
