package Office_Hours.Practice_06_17_2020;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a = 300;
        System.out.println(++a);//a = 301
        System.out.println(++a);// 3=2

        int b=50;
        System.out.println(--b);//b = 49
        System.out.println(--b);//b = 48


        System.out.println("====================");
        int x=40;
        System.out.println(x--); //40
        System.out.println(x); //39
        System.out.println(x--); //39
        System.out.println(x);// x=38

        System.out.println("====================");
    }
}
