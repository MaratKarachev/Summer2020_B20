package AdamRochwick;

public class MissingNumber {
    public static void main(String[] args) {



    int num [] = {1,2,3,4,6,7,8,9};

        System.out.println(missingNumber(num));


}

    public static int missingNumber(int[] arr)
    {
        int missingNum=arr.length+1;
        int sum=missingNum*(missingNum+1)/2;
        int missing=0;
        for (int i = 0; i < arr.length; i++) {
            missing+=arr[i];
        }
        int missingNumber=sum-missing;
        return missingNumber;
    }
}

