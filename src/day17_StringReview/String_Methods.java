package day17_StringReview;

public class String_Methods {

    /*
    String methods: charAt, +(concat), length, upper, lower, trim, substring, replace, replaceFirst, indexOf, lastIndexOf.
     */
    public static void main(String[] args) {
        //charAt(index): ==> char
        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(7);
        System.out.println(ch1);

        //+:
        String str2 = "Cybertek";
        str2 = str2 + " School";

        System.out.println(str2);

        //length():
        String str3 = "Cybertek";
        int l = str3.length();
        System.out.println(l);

        //lastIndex:length -1
        char ch2 = str3.charAt(l - 1); // str3.length()-1
        System.out.println(ch2);

        //upperCase & lowerCase:

        String str4 = "cybertek";
        str4 = str4.toUpperCase(); // CYBERTEK

        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase(); //java
        System.out.println(str5);

        //trim():
        String str6 = "         Cybertek  School     ";
        System.out.println(str6);
        str6 = str6.trim(); // "Cybertek"
        System.out.println(str6);

        //substring: ending index is excluded, beginning index is included.

        String str7 = "I like Java language";
        //             012345678910........
        String word = str7.substring(7, 11); // "Java"
        System.out.println(str7);
        System.out.println(word);

        String word2 = str7.substring(12, str7.length()); //language
        String word3 = str7.substring(12); // language
        System.out.println(word2);
        System.out.println(word3);

        System.out.println("================================");
        // indexOf & lastIndexOf ==> int
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));
        int i2 = str8.indexOf(", W") + 2;
        int i3 = str8.indexOf("We");
        System.out.println(i2);
        System.out.println(i3);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J"); // ==>10 Last J in the string
        int i5 = str9.indexOf("J"); // ==>0 First J in the string

        int i6 = str9.indexOf(" Java ") + 1; // ==>5 Second J in the string
        int i7 = str9.lastIndexOf("Java "); // ==>5 Second J in the string
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

        //replace & replaceFirst
        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#"); //"....."
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");
        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C# is");
        System.out.println(s3);

    }
}
