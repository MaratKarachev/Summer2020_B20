package day09_IfStatement;

public class breaks {
    public static void main(String[] args) {
        String itsBreakTime = "no";

        if (itsBreakTime == "yes") {
            System.out.println("Take 15 minutes break");

        } else {
            System.out.println("Continue the class");
        }

        System.out.println("==============================");

        int a = 300;
        int b = 700;

        if(a>b){
            System.out.println(a+ " is bigger number");
        }else{
            System.out.println(b+ " is bigger number");
        }


    }
}
