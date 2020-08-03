package day11_NestedIf_Ternary;

public class TernaryPractice3 {
    public static void main(String[] args) {
        /* write a program that can compare two number
        a=10, b=20
        output: b is greater

        a=30, b=10
        output: a is greater

        a=20, b=20
        output: is equal
         */
        int a=20;
        int b=20;

        String result = (a>b)? "a is greater" : (b>a)? "b is greater" : "a is equal to b";
        System.out.println(result);
    }
}
