package day13_Scanner;

import java.util.Scanner;

public class AreaOfCircleAndRectangle {
    public static void main(String[] args) {
        Scanner circle=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r=circle.nextInt();
        double Pi=3.14;
        double areaOfCircle=Pi*r*r;

        System.out.println("Area of circle: "+ areaOfCircle);

        System.out.println("=======================================");

        Scanner rectangle=new Scanner(System.in);
        System.out.println("Enter length");
        int l=rectangle.nextInt();
        System.out.println("Enter width");
        int w=rectangle.nextInt();

        int areaOfRectangle=w*l;

        System.out.println("Area of Rectangles: " +areaOfRectangle);




    }
}
