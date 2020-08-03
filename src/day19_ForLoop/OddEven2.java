package day19_ForLoop;

public class OddEven2 {
    public static void main(String[] args) {


        //3. print odd numbers 1-50
        //4. print even number 1-50

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) { //if the number is odd, skip it
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("=======================");

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) { // if the number is even, skip it
                continue;
            }
            System.out.print(i + " ");
        }


















    }
}
