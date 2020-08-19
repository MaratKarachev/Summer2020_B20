package day42_Static;

public class StaticMethods {

    int a = 200; // instance
    static int b = 400; // static

    public static void main(String[] args) {

        System.out.println(b);
        // System.out.println(a);
        // System.out.println(this.a);

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);// the ONLY wa to call instances in a static method


        staticMethod();
        StaticMethods.staticMethod();
      // instanceMethod();
      // StaticMethods.instanceMethod();

        obj.instanceMethod();

    }

    public static void staticMethod(){

    }
    public void instanceMethod(){}

}
