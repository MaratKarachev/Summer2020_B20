package day34_WrapperClasses;

/*
  Integer, Double, Character, Boolean
  Parse methods: converts string of text to primitive
  not case sensitive

  ValueOf methods: converts string of text to wrapper class


 */

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str);                 //123

        System.out.println(str + 1); //1231
        System.out.println(a + 1);//124

        Double d1 = Double.parseDouble("7.5");
        //double d2 = 12.5;
        System.out.println(d1 - 1);

        String s1 = "TRUE";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(!b1);
        System.out.println("==================================");

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2); //unboxing
        System.out.println(d2 * 2);

        String s3 = "FaLSe";
        boolean d3 = Boolean.valueOf(s3);
        System.out.println(d3);


    }
}
