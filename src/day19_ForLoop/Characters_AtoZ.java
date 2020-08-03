package day19_ForLoop;

/*
5. Write a program that will print out all letters in English alphabet in ascending order
6. Write a program that will print out all letters in English alphabet in descending order
 */

public class Characters_AtoZ {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (int i = 97; i <= 122; i++){
            System.out.print((char) i+ " ");
        }
        System.out.println();
        System.out.println("========================================================");

        //#6
        for (char ch='Z'; ch>='A'; ch--){
            System.out.print(ch+ " ");
        }
        System.out.println();
        for (char ch='z'; ch>='a'; ch--){
            System.out.print(ch+ " ");
        }
        System.out.println();
        for(int i=90; i>=65; i--){
            System.out.print((char)i+ " ");
        }

    }
}
