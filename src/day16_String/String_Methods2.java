package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {

        //isEmpty(): checks if the string is empty.returns boolean

        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());


        //equals(): checks if the string has same text as the given string
        // CANNOT ignore the case sensitivity

        String str1 = "Java"; //String pool
        String str2 = new String("Java"); //heap
        System.out.println(str1 + " : " + str2);
        System.out.println(str1 == str2); // false

        System.out.println(str1.equals(str2)); //use equals method to compare string text values

        String str3 = new String("Java"); // when create with new, different object
        String str4 = new String("Java"); // when create with new, different object

        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true

        String str5 = "Java";
        String str6 = "Java";

        System.out.println(str5 == str6); //  true
        System.out.println(str5.equals(str6)); // true

        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7 == str8); // false


        //equalsIgnoreCase(): checks if the string has same text with the given string. returns boolean
        // CAN IGNORE THE CASE SENSITIVITY

        System.out.println(str7.equalsIgnoreCase(str8)); // true
        System.out.println("====================================");

        //contains(): checks if the given str is contained in the string or not. returns boolean

        String str = "I like to learn java programming language";
        System.out.println(str.contains("python")); // false
        System.out.println(!str.contains("python")); // true

        System.out.println(str.contains("java")); // true
        System.out.println(str.contains("JAVA")); // false, because case sensitive
        System.out.println("====================================");

        //startsWith(str): checks if the string is started with the given str. returns boolean

        String s1 = "Marat";
        System.out.println(s1.startsWith("M")); //true
        System.out.println(s1.startsWith("J")); //false

        System.out.println(s1.startsWith("Ma")); //true

        System.out.println(s1.toLowerCase().contains("ma")); //true
        //                       "marat".contains("mu")

        //endsWith(str): check if the string is ended with the given str. returns boolean




    }
}
