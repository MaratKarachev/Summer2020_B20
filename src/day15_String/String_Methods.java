package day15_String;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             01234567
        //charAt(index):
        char ch1 = name.charAt(0);
        char ch5 = name.charAt(5);

        System.out.println(ch1);
        System.out.println(ch5);

        //length()==>int
        int l = name.length();
        System.out.println(l);

        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);

        System.out.println("=========================================");

        //concat(Str):
        String schoolName = "Cybertek";

        schoolName = schoolName.concat(" School"); // "Cybertek School"

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A' + true; // using "+" to concat

        System.out.println(r1);

        String r2 = "Cybertek".concat("123"); // concat. only string to a string
        System.out.println(r2);

        System.out.println("=========================================");

        //toLowerCase(): created the lowercase version of the string, returns new String

        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();      // "cybertek school"
        System.out.println(name1);

        System.out.println("=========================================");

        //toUpperCase(): creates the uppercase version of the string, returns new String

        String name2 = "marat";
        name2 = name2.toUpperCase(); // "MARAT"
        System.out.println(name2);

        System.out.println("=========================================");

        //trim(): removes the unused space,(white space) returns new String (will not trim the spaces between words)

        String p = "     Cybertek School        ";
        p = p.trim(); //"Cybertek School"
        System.out.println(p);

        System.out.println("=========================================");


    }
}
