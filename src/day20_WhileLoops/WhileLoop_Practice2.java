package day20_WhileLoops;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {


        int num = 10;
        while (num < 15) {
            System.out.println("Marat Karachev");

            num++;
        }

        System.out.println(num); //15

        System.out.println("==============================");
        String str="Cybertek School";
        String result="";
        //          01234567
        int index=str.length()-1;
        while(index>=0){
          result+=str.charAt(index);

            index--;
        }
        System.out.print(result);



    }
}
