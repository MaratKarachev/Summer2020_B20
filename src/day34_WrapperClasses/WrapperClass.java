package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {

        /*
       Wrapper class: Byte, Short, Integer, Long, Character, Boolean, Double, Float
       Primitive type:byte   short  int     long   char      boolean  double  float

       Default values:
       primitives:
       byte, short, int, long ==>0
       double, float ==> 0.0
       boolean ==> false

       Wrapper class: null

       Autoboxing: converting primitive values to wrapper class : implicitly done
       Unboxing: converting wrapper class values to primitives: implicitly done
        */

        Integer num = 100;
        int a = 100;

        byte t = 100;
        int z  = t;

        //Integer z2 =t

        Byte b1 =50;
        int n1 = b1;

        byte b2=40;
       // Integer n2 = b2; not gonna work

        Integer n3 = new Integer (123);

        Integer[] arr = new Integer[3];

        System.out.println(Arrays.toString(arr));

        int p1=300;
        Integer p2 = p1; //Autoboxing

        Integer q1 = 500;
        int q2 = q1; //Unboxing

        //Double r1 =300; // wrapper class is only dedicated to its primitive
        Double r1 = 300.0;
        double r2 = r1; //unboxing

        long l1 = 400;
        Long l2 = l1; //autoboxing

        Float f1 = 100.5f;
        Float f2 = f1;

        //1. Create an array of Double and Iterate every elements using for each loop.
    }
}
