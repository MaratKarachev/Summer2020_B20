package InterviewQuestions;

public class SwapNumbers {

    //Swap two variable' values without using a third variable

    public static void swapNumbers(int a, int b) {
        //10   //20


        a = 10;
        b = 20;

        a = a + b; // 10=10+20 = 30
        b = a - b; // 20=30-20 = 10
        a = a - b; // 30=30-10 = 20

    }

    }
