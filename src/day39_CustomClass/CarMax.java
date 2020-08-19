package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Lexus", "RX350", 2019, "White", 14000, 45000);
        car2.setInfo("Lexus", "RX450", 2020, "Black", 1000,50000);
        car3.setInfo("Bugatti", "Veyrone", 2018, "Blue", 23000, 500000);
        car4.setInfo("Ford","Escape", 2018,"White",25000,20000);
        car5.setInfo("Nissan", "GT-R", 2015, "Blue", 54123, 89650);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();
        System.out.println("==========================");
        car3.start();
    }

}
