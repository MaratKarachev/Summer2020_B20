package day18_ForLoop;

public class tasks {

    //all even numbers between 0 ~ 1000
    //all odd numbers between 0 ~ 1000

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("=========================");

        for (int ii = 0; ii <= 1000; ii++) {
            if (ii % 2 == 0) {
                System.out.print(ii + " ");
            }
        }

        System.out.println("==========================");
        for (int k = 11; k<=121; k++){
            if(k%2!=0){
                System.out.println(k+ " ");
            }
        }

        System.out.println("==========================");

        for(int k=0; k<=49; k++){
            System.out.println("#");
        }

        }

    }



