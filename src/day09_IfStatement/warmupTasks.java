package day09_IfStatement;

public class warmupTasks {
    public static void main(String[] args) {
        int num1=1;
        int num2=-6;
        int num3=0;

        if (num1>0){
            System.out.println(num1 + " is positive number");
        }
        if (num2<0){
            System.out.println(num2 + " is negative number");
        }
        if (num3==0){
            System.out.println(" zero");
        }
        System.out.println("================================");

        int grade=75;

        if(grade>=90){
            System.out.println("Excellent");
        }
        if(grade>=70&&grade<=90){
            System.out.println("Good");
        }
        if(grade>=60&&grade<=70){
            System.out.println("Pass");
        }
        if(grade<=60){
            System.out.println("Fail");
        }
        System.out.println("================================");
        int score=96;

        if(score>=90&&score<=100){
            System.out.println("Your grade is A");
        }
        if(score>=80&&score<=89){
            System.out.println("Your grade is B");
        }
        if(score>=70&&score<=79){
            System.out.println("Your grade is C");
        }
        if(score>=60&&score<=69){
            System.out.println("Your grade is D");
        }
        if(score<=59){
            System.out.println("Your grade is F");
        }
    }
}



