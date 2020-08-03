package day16_String;

public class String_Methods {
    public static void main(String[] args) {

        /* replace(old value, new value): new value will be replaced with all the given old values. Returns new string
    String str1 = "I like to learn Java, Java is cool"
    String str2 = str.replace("Java", "C#"); // "I like to learn C#, C# is cool"
     */

        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo"); // "cybertek@yahoo.com"

        System.out.println(email);
        String word = "java";
        word = word.replace("a", "e"); // "jeve"
        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);

        System.out.println("============================");

        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; //MIT
        s1 = s1.replace("Cybertek", "MIT");
        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java"; //r
        s2 = s2.replace('R', 'r'); // "I like to learn Java"
        System.out.println(s2);


        //replaceFirst(oldValue, newValue): replaces the first occurred value with the new value, returns new String

        String s3 = "I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola"); //"I like to drink cola and tea"

        System.out.println(s3);

        String s4 = "I like to watch Game of Thrones, and Walking Dead";
        s4 = s4.replace(", and Walking Dead", ""); // I like to watch Game of Thrones
        System.out.println(s4);


        // indexOf(value): returns the first index number
        String s5 = "I like to stay in Cybertek, we are learning Java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");// returns the first char 'r' index number
        int r3 = s5.indexOf("rning");// returns the first char 'r' index number

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


        //lastIndexOf(value): returns the last index number
        String s6 = "Java ia a programming language, and Java is fun";

        int I1 = s6.indexOf("Java is fun"); // prints the first index J
        int I2 = s6.lastIndexOf("J"); // prints the last index J

        System.out.println(I1);
        System.out.println(I2);

        String s7 = "Java";
        int I3 = s7.indexOf("A");
        System.out.println(I3);



    }
}