package InterviewQuestions;

public class FactorialNumber {

    public static void factorial (int num){
     int result = 1;

     for(int i=1;i<=num; i++){
         result*=i;
     }

        System.out.println(result);

    }

    public static void main(String[] args) {
        factorial(10);
    }
}
