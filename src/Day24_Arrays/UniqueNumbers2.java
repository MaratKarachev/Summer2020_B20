package Day24_Arrays;

public class UniqueNumbers2 {
    public static void main(String[] args) {

        //FOR EACH LOOP, only applicable when index from 0 till the last index

        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8,};

        for (int a:arr){
            //j: 0,1,2,3,4
            int num1 = a;
            int count = 0;

            for (int b: arr){ // only calculates the frequency of num

                if (b == num1) {
                    count++;
                }
            }


            if (count == 1) {
                System.out.print(a+ " ");
            }
        }



    }
}
