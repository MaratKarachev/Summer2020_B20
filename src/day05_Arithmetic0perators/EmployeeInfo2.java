package day05_Arithmetic0perators;

public class EmployeeInfo2 {
    public static void main(String[] args) {
        String firstName = "Marat";
        String lastName  = "Karachev";
        char gender = 'M';
        int age = 26;
        String companyName = "CapitalOne";
        String jobTitle = ("SDET");
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 140_000.5;

        String fullName = firstName+" "+lastName;


        System.out.println("Employee's full name is: "+ fullName);
        System.out.println(fullName + "'s gender is: " +gender);
        System.out.println(fullName + "'s age is: " + age + " years old");
        System.out.println(fullName + " works at: " +companyName);
        System.out.println(fullName + "'s Job title is: "+ jobTitle);
        System.out.println(fullName + "'salary is : $"+salary);
        System.out.println(fullName +" is Full time employee: "+isFullTime);
        System.out.println(fullName + " is married: "+isMarried);

    }
}


