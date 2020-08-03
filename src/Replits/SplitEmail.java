package Replits;
import java.util.*;
public class SplitEmail {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String email = input.nextLine();

            //Write your code below
                //fancy@email.com
                //split ("@"). ==> fancy | email.com

                //my@fancy@email.com
                //split ("@"). ==> my | fancy | email.com

            String [] arr = email.split("@");
            if(arr.length==2){
                System.out.println("Email id: "+arr[0]);
                System.out.println("Email domain: "+arr[1]);

            }else {
                System.out.println("invalid email");
            }
            }


        }


