package day09_IfStatement;
/*
  1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
    4. write a java program that can identify if a person is eligible to buy alcohol
 */
public class maximum {
    public static void main(String[] args) {
        double a=500;
        double b=200;
        double c=1000;

        boolean aIsMax = a > b && a > c;
        //             500>200 || 500>1000
        //                true || false ==> false
        boolean bIsMax = b > a && b > c;
        //        aIsMax == false && b>c (possible logic)n1
        //             b>a && b>c
        boolean cIsMax = aIsMax==false && bIsMax==false;
        //       !aIsMax && !bIsMax ==> !(aIsMax && bIsMax)
        //        c > a && c > b;
        //              1000>a && 1000 > 200

        double max = 0; // we want to assign maximum number to variable max

        System.out.println(max);


        if(aIsMax){
            // System.out.println(a);
            max = a;
        }
        if(bIsMax) {
           // System.out.println(b);
            max = b;
        }
        if(cIsMax){
            // System.out.println(c);
            max = c;
        }
        System.out.println(max);



    }
}
