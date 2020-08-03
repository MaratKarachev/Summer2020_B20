package day25_Practices;

public class ShortestString {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali","Joe"};

        int minLength = arr[0].length();//4

        for (int i = 0; i <= arr.length - 1; i++) { // to find out the minimum length of the string in the array
            int l = arr[i].length(); // 4 8 4 8 length of elements from arr

            if (l < minLength) {
                minLength = l;
            }
        }

        System.out.println(minLength);

        for (int i = 0; i <= arr.length - 1; i++) { // to see how many Strings lengths in the array is matching with minlength

            if (arr[i].length() == minLength) {
                System.out.println(arr[i]);
            }
        }


    }
}
