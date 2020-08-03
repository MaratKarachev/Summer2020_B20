package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abi", "Ali", "Joe"};

        int minLength = arr[0].length();//4

        for (String each : arr) { // to find out the minimum length of the string in the array

            if (each.length() < minLength) {
                minLength = each.length();
            }
        }

        System.out.println(minLength);

        for (String each: arr) { // to see how many Strings lengths in the array is matching with minlength

            if (each.length() == minLength) {
                System.out.println(each);
            }
        }


    }
}
