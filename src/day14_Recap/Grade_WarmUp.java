package day14_Recap;
/*
write a program that can calculate the grade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
 */
import java.util.Scanner;

public class Grade_WarmUp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score");
        double score=input.nextDouble();
            input.close();  ; //closes the scanner and we will not be able to use it afterwards.

        String result="";

        boolean grade= score>0 && score<=100;

        if(grade){
            if(score>=90 && score<=100){
                result="Excellent";
            }else if(score>=80){
                result="Great";
            }else if(score>=70){
                result="Good";
            }else if(score>=60){
                result="Passed";
            }else{
                result="Failed";
            }

        }else{
            result="Invalid entry";
        }
        System.out.println(result);

    }
}
