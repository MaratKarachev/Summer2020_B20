package day19_ForLoop;

/*
    3.write a program that can calculate the sum of all the even numbers between 1 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

 */

public class SumOfEvenOdd {
    public static void main(String[] args) {

        //#3
        int sumOfEven = 0;
/*
        sum += 2;
        sum += 4;
        ...
 */
/*
        for (int i = 0; i <= 100; i += 2) {
            sumOfEven += i; // sum of all even numbers
        }
        System.out.println(sumOfEven);

 */

        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            }
        }
        System.out.println(sumOfEven);

        //#4
        // 1 3 5 7 9 ... 99

        int sumOfOdd = 0;

       /* for (int i = 1; i <= 99; i += 2) {
            sumOfOdd += i;
        }
        System.out.print(sumOfOdd);

        */

        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0){
                sumOfOdd += i;

            }
        }
        System.out.println(sumOfOdd);
    }
}

