package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 1, 5, 6, 6, 7, 8, 8};


        for (int b : arr) {


            int count = 0; // for the frequency of num in the arr

            for (int each : arr) { // for counting the frequency of num
                if (each == b) {
                    count += 1;
                }
            }

            if (count == 1) {
                System.out.println(b);
            }
        }

    }
}
