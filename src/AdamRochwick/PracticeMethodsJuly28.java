package AdamRochwick;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PracticeMethodsJuly28 {
    public static void main(String[] args) {

        /*
        print multiplications
        123
        246
        369
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int a = scan.nextInt();
        multiTable(a);

        /*first we have to look  at each individual section 1-5 horizontal and
        1-5 vertical.(int number, int coefficient)
        then we will start with loop, declare starting point =>
        and we want that to be <= to coefficient*number.

        Second method: start with another loop, declare it with 1, while num<=max, =>
        called the first custom method above. Increment num++, to keep that loop going.
        Then we call the method and put number that we want the multiplication table for.


         */
    }




    public static void tableRow (int number, int coefficient){

        int printing = number;
        while(printing<=number * coefficient){
            System.out.print(" "+ printing);
            printing +=number;
        }
        System.out.println("");
    }


    public static void multiTable(int max){

        int num = 1;
        while(num<=max){
            tableRow (num, max);
            num++;
        }
    }

}


