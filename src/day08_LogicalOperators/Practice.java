package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        //18 or older and must be US citizen
        String firstName="Marat";
        String lastName="Karachev";
        String fullName=firstName+ " "+ lastName;
        int age=26;
        String citizenShip="Kyrgyzstan";
        boolean eligibleToVote=age>=18 && citizenShip=="USA";
        //                      19>=18 && "USA" == "USA"
        //                         true && true ==> true

        System.out.println(eligibleToVote);
        System.out.println(fullName+ " is eligible to vote: " +eligibleToVote);





    }
}
