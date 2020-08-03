package day11_NestedIf_Ternary;

public class TernaryPractice1 {
    public static void main(String[] args) {

        int age = 21;
        String citizen = "USA";
        String result = "";


        if (age >= 18 && citizen == "USA") {
            result = "Can vote";
        } else {
            result = "Can not vote";
        }
        System.out.println(result);

        String result2 = (age >= 18 && citizen == "USA") ? "Can vote" : "Can not vote";
        System.out.println(result2);

        //second task: "can vote" or "can't vote"

        System.out.println("===============================");
        // third task: equal or not equal
        int n1 = 100;
        int n2 = 200;

        String r= (n1==n2)? "equal":"not equal";
        //"equal" or "not equal"
        System.out.println(r);

        // IN TERNARY TOTAL NUMBERS OF "?" AND TOTAL NUMBERS OF ":" MUST BE EQUAL

    }
}
