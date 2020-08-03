package day08_LogicalOperators;

public class IfStatement {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;

        if (a > b) {
            System.out.println(a + " is the largest number");
        }

        if (b > a) {
            System.out.println(b + " is the largest number");
        }

        if (a == b) {
            System.out.println("Both are equal");
        }

        System.out.println("==================================");

        boolean BreakTime = false;

        if (BreakTime == true) {
            System.out.println("take 15 minutes break");
        }
        if (BreakTime == false) {
            System.out.println("keep studying");
        }
        System.out.println("==================================");
        boolean Corona = true;
        if (Corona == true) {
            System.out.println("Buy more toilet paper");
            System.out.println("Social distance");
            System.out.println("Stay at home");
            System.out.println("Buy hand sanitizer");
        }
    }
}
