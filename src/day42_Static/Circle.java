package day42_Static;

public class Circle {

    double radius;
    double diameter;
   static double Pi = 3.14;

   public void setInfo(double radius){
       this.radius = radius;
       diameter=radius*2;
   }
   public double calcArea(){
       return radius * radius * Pi;
   }

   public double calcPerimeter (){
       return diameter*Pi;
   }



   public String toString(){
       return "Radius: "+ radius+ "\nDiameter: "+diameter+"\n PI: "+Pi+"\nArea: " +calcArea()+"\nPerimeter: "+calcPerimeter();


   }
}
