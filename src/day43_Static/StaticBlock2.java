package day43_Static;

import day42_Static.Tester;

public class StaticBlock2 {

    static int a = 100;
    static String b = "Cybertek";
    static Tester tester1;
    static Tester tester2;

    //static ExcelSheet excel=;

    static {
         a = 100;
         b = "Cybertek";

        tester1 = new Tester();
        tester1.setInfo("Marat",'M',123,"SDET", 100000 );

        tester2 = new Tester();
        tester2.setInfo("Muhtar",'M',321, "SDET",100000);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
