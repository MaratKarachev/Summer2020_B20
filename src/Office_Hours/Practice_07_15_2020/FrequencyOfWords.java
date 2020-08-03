package Office_Hours.Practice_07_15_2020;

import java.sql.SQLOutput;

/*
Write a program that can find the frequency of a word from a string (not from a sentence)

input: CatCatCat
Output: 2
input: JavaJavaJava
Output: 3
 */
public class FrequencyOfWords {
    public static void main(String[] args) {

        String str = "cat cat cat cat cat Dog Dog dog dog dog"; //first option .toLowerCase

        int countOfDog = 0;
        int countOfCat = 0;
        while (str.contains("cat")) {
            countOfCat++;
            str = str.toLowerCase().replaceFirst("cat", "");

        }

        while(str.contains("dog")){
            countOfDog++;
            str = str.toLowerCase().replaceFirst("dog", "");
        }

        System.out.println("Cat: "+countOfCat);
        System.out.println("Dog: "+countOfDog);
        System.out.println(countOfCat==countOfDog);
        }
    }

