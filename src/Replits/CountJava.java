package Replits;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int charCount = word.length();
        int targetCharCount = 4; //java
       //012345
        //ajavaz
        //word.substring(0,4); ajav

        int count=0;


        for(int i = 0; i<=charCount-4; i++){

            String current4 = word.substring(i,i+4);
            //System.out.println(current4);

            if(current4.equals("java")){
                count++;
            }
        }
        System.out.println(count);
        }

    }


