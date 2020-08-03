package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {

        String firsName = "Khabib";
        String lastName = "Nurmagomedov";
        String fullName = firsName+ " " +lastName;

        int age=21;
        String citizen1="Russia";
        String citizen2="USA";
         boolean eligibleAge=age>=18;
                            //12>=18==>false
         boolean usCitizen= citizen1=="USA" || citizen2=="USA";
                            // "USA"=="USA" || "France" == "USA"
                            // true         || false ==> true

         boolean eligibleToVote=eligibleAge&&usCitizen;
         //                     false      && true ==> false

        System.out.println(fullName+ " is eligible to vote for Trump: " +eligibleToVote);



    }
}
