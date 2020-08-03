package Replits;
import java.util.*;
public class ifStatementBurgerChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();

        //your code here
        if (in.equals("burger") ||in.equals("chicken")) {
            System.out.println(10.0f);
        }else if(in.equals("soda")) {
            System.out.println(2.0f);
        }
    }
}