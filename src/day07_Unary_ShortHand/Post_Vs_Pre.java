package day07_Unary_ShortHand;

public class Post_Vs_Pre {
    public static void main(String[] args) {
        //Pre:
        int a=10;
        System.out.println(++a); //11
        System.out.println(a); //11

        System.out.println("=============================");
        //Post:
        int b=10;
        System.out.println(b++); //10
        System.out.println(b); //11

        System.out.println("=============================");
        int c=25;
        int d=c++; //d=25
        //c=26
        System.out.println(c);
        System.out.println(d);

        System.out.println("=============================");
        int e=25;
        e++; //25
        System.out.println(e);

        System.out.println("==============================");
        int x=8;
        int y= x--; //y=8
        System.out.println(y);
        System.out.println(x);

        System.out.println("==============================");

        int A=1; //A=0
        A= -A-- + A++ / -A-- * --A;
        //A= -1 + 0 / -1   * -1;
        //A= 0/-1=0
        //A= -1 + 0 * -1
        //A= -1 + 0= -1
        System.out.println(A);






    }
}
