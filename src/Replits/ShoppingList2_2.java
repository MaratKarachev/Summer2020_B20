package Replits;
import java.util.Scanner;
public class ShoppingList2_2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        System.out.println("Enter Item1 and its price: ");
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        System.out.println("Add one more item?");
        if(countinue=="yes"){
        }



        System.out.println("Enter Item2 and its price: ");
        String item2 = scan.next();
        double price2 = scan.nextDouble();


        System.out.println("Enter Item3and its price: ");
        String item3 = scan.next();
        double price3 = scan.nextDouble();



    }
}
