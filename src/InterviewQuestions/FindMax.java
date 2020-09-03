package InterviewQuestions;

public class FindMax {
        public static int findMax(int[] num){
            int max = Integer.MIN_VALUE;    // sign a min value of int
            for(int each: num){ // getting each num of the arr
                if(each>max){   // if each is bigger than our min value and then each min number
                    max=each;   // assign that number to the max variable
                }
            }
            return max; // return max int
        }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5};
        System.out.println(findMax(nums));

        //OR
        System.out.println(findMax(new int[]{1,5,9}));
    }



}
