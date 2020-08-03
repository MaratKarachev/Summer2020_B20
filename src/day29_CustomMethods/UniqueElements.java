package day29_CustomMethods;

public class UniqueElements {

    //8. write a method that can print out the unique elements from an array of string
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};
        uniques(arr);

        String [] arr2 = {"D","D","E","F","F"};
        uniques(arr2);
    }

    public static void uniques (String []arr){
        for(String a:arr){ //get each of the element
            int count = 0;

            for (String each : arr){//get the frequency of the element
                if(a.equals(each)){
                    count++;
                }
            }

            if(count==1){//if unique
                System.out.print(a+" ");
            }
        }
        System.out.println(); //need this empty print statement to append a new line

    }

}
