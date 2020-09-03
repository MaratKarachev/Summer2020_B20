package InterviewQuestions;

public class sumOfDigits {
    static int sumFromString(String str){
        int sum=0;
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
                sum+=(ch-'0'); // By subtracting '0' from whatever number is in the string,
                // you get the actual value of that integer. The same applies to all the other integers.
            }
        }
        return sum;
    }

    public static void main(String[] args) {
         int sumNum = sumFromString("Cyb3re7k");

        System.out.println(sumNum);
    }
}
