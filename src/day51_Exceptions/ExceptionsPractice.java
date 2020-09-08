package day51_Exceptions;

import Library.Util;

public class ExceptionsPractice {

    public static void main(String[] args) {

        System.out.println("Hello");

        sleep(3);
/*
        try {
            Thread.sleep(5000); //checked exception
        } catch (InterruptedException e) {

        }

 */
        System.out.println("World");
        sleep(3);
       /* try {
            Thread.sleep(3000); //checked exception
        }catch(InterruptedException e){

        }

        */
        System.out.println("How are you?");
    }

    public static void sleep(double seconds) {

        try {
            Thread.sleep((long) seconds * 1000);
        } catch (InterruptedException e) {

        }

    }

    // causes the current execution thread to sleep for given seconds

    //getMessage(): gets 

}
