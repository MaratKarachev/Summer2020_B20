package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {
        int a=100;
        //a=a*a;/10,000
        a*=a; //shortcut same result, 10,000
        System.out.println(a);

        int b=2;
        b*=3; //6
        System.out.println(b);

        int c=300;
        c-=100; //200
        System.out.println(c);

        System.out.println("========================");

        //+=:
        int z=300;
        z+=200;
        System.out.println(z);

        String schoolName="Cybertek";
        //schoolName=schoolName+" School"; //old version
        schoolName+=" School";
        System.out.println(schoolName);

        String fullName = "Marat";
        fullName+= " Karachev";
        System.out.println(fullName);

        String firstName = "Aaron Daniel";
        //firstName-= " Daniel"; can not substract text or String, only numbers

        int budget=100000;
        //math calculation: budget/2 = 50000
        budget/=2; //Java short cut calculation =50000
        System.out.println(budget);

        //
        int q=100;
        System.out.println(q/2); //=50
        System.out.println(q); //=100


        int x=100;
        x/=2;//50
        System.out.println(x);
        x*=2;//100
        System.out.println(x);

        //%=remainder assignment

        int A=10;
        A%=2; // =0
        System.out.println(A);

        int num =100;
        num%=3;
        System.out.println(num);

        double num2=400.2;
        num2%=2;
        System.out.println(num2);


    }
}
