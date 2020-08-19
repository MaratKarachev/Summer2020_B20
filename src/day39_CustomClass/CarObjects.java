package day39_CustomClass;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

        /*
            car1.brand = "Toyota";
            car1.model = "Corolla";
            car1.year = 2020;
            car1.color = "White";
            car1.mileage = 20000;
            car1.price = 19000.50;
         */

        car1.setInfo("Toyota","Corolla",2010,"Red",55000,16000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("==============================");

        Car car2 = new Car();

        /*
            car2.brand = "Mercedes";
            car2.model = "G 550";
            car2.year = 2000;
            car2.color = "Blue";
         */
        car2.setInfo("BMW", "X6", 2020, "Black", 0, 80000);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        System.out.println("==============================");

        Car myCar = new Car();

        myCar.setInfo("BMW", "328", 2015,"Black", 43000, 18000);


        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.year);
        System.out.println(myCar.color);
        System.out.println(myCar.mileage);
        System.out.println(myCar.price);

        myCar.getInfo();
        car1.getInfo();
        car2.getInfo();

    }
}
