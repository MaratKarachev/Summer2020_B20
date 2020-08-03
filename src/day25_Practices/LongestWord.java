package day25_Practices;

public class LongestWord {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abduljabar", "Mamattursun", "Gebremariam",
                "VasilicaPutulica"};

        int maxLength = arr[0].length();//4 because it is the length of the first word in array

        for(String each : arr){
            if(each.length()>maxLength){
                maxLength=each.length();
            }
        }
        System.out.println(maxLength);

        for(String each : arr){
            if(each.length()==maxLength){
                System.out.println(each);
            }
        }

    }
}
