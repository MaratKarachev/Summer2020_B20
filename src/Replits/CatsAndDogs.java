package Replits;

import java.util.Scanner;

public class CatsAndDogs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        for (int i = 0; i <=word.length()-3 ; i++) {
            if ("cat".equalsIgnoreCase(word.substring(i, i + 3))) {
                countOfCats += 1;
            }
        }
            for(int i=0; i<=word.length()-3;i++)
            if("dog".equalsIgnoreCase(word.substring(i, i+3))){
                countOfDogs += 1;
            }

            if (countOfCats == countOfDogs) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

            }

