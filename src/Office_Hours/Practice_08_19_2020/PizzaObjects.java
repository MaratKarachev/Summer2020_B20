package Office_Hours.Practice_08_19_2020;

import java.util.ArrayList;

public class PizzaObjects {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzaForBatch20 = new ArrayList<>();

        for (int i = 0; i < 400; i++) {
            Pizza myPizza = new Pizza();
            myPizza.setPizzaInfo("Large", 2, 0);
            pizzaForBatch20.add(myPizza);

        }
        System.out.println("Total Number of pizza: " + pizzaForBatch20.size());
        double totalPrice = 0;

        for (Pizza each : pizzaForBatch20) {
            totalPrice += each.calCost();

        }
        System.out.println("Total price: $" + totalPrice);

        System.out.println("===================================================");

        Pizza pizza1 = new Pizza();
        pizza1.setPizzaInfo("Large", 3, 4);

        Pizza pizza2 = new Pizza();
        pizza2.setPizzaInfo("Medium", 3, 2);

        System.out.println("Nadir's pizza: $"+pizza1.calCost());
        System.out.println("Saim's pizza: $"+pizza2.calCost());
    }

}
