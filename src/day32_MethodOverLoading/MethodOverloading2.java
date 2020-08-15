package day32_MethodOverLoading;

/*
tasks1:
    1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers
                        addition
 */

public class MethodOverloading2 {
    public static void main(String[] args) {

        addition2Numbers(10, 20);
        addition3Numbers(10, 20, 30);
        addition4Numbers(10, 20, 30, 40);


        System.out.println("============================");

        addition(10, 20);
        addition(10, 20, 30);
        addition(10, 20, 30, 40);
    }

    public static void addition2Numbers(double a, double b) {
        System.out.println(a + b);
    }

    public static void addition3Numbers(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition4Numbers(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);
    }


    //=============================================

    public static void addition(double a, double b) {
        System.out.println(a + b);
    }

    public static void addition(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);
    }
    /*
    task2:
    1. create a method that can combine 2 arrays of integers
    2. create a method that can combine 2 arrays of double
    3. create a method that can combine 2 arrays of String
    4. create a method that can combine 2 arrays of char

    First solution: DO NOT use method overloading
    Second solution: apply method overloading
     */

    public static void combine2Arrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

    }
}
