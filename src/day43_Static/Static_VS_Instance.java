package day43_Static;

import day42_Static.Static;

public class Static_VS_Instance {

    static int staticVariable; // 1 copy of static
    int instanceVariable; // 2 copies

    public static void main(String[] args) {

        Static_VS_Instance obj1 = new Static_VS_Instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;
;
        Static_VS_Instance obj2 = new Static_VS_Instance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable); //100
        System.out.println(obj2.instanceVariable); //200

        System.out.println("=================================================");

        System.out.println(obj1.staticVariable); //400
        System.out.println(obj2.staticVariable); //400

        System.out.println(Static_VS_Instance.staticVariable); //preferred way to call static through class name not the object




    }
}
