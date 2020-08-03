package day07_Unary_ShortHand;

public class Divisible_2_3_5 {
    public static void main(String[] args) {
                short number=65;
                boolean by2=number%2==0;
                boolean by3=number%3==0;
                boolean by5=number%5==0;
                System.out.println(number+ " is divisible by 2: " +by2);
                System.out.println(number+ " is divisible by 3: " +by3);
                System.out.println(number+ " is divisible by 5: " +by5);

                int numberIs=1500;
                boolean divisibleBy2=numberIs%2==0;
                boolean divisibleBy3=numberIs%3==0;
                boolean divisibleBy5=numberIs%5==0;

        System.out.println(numberIs+ " is evenly divisible by 2: "+divisibleBy2);
        System.out.println(numberIs+ " is evenly divisible by 3: "+divisibleBy3);
        System.out.println(numberIs+ " is evenly divisible by 5: "+divisibleBy5);

    }
}
