package InterviewQuestions;

public class FindHello {
    public static void main(String[] args) {


        String x = "AHCECLWLXO";
        int count = 0;
        String y = "HELLO";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == y.charAt(count)) {
                System.out.print(x.charAt(i));
                count++;
            }
        }
    }
}
