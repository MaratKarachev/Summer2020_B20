package Replits;

public class RowSum {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int[] sums = rowSums(a);

        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums) {
        int [] sum = new int[nums.length]; // 4 elements
        for(int i = 0; i<=nums.length-1; i++){// every single element of 2-D Array
            int combined = 0;
            for(int j=0; j<=nums[i].length-1; j++){
                combined+=nums[i][j];
            }
            sum[i]= combined; // [4] = assigning to sum of arrays
        }

        return sum;

    }
}

