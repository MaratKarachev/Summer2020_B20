package day05_Arithmetic0perators;
/* 1. create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false


 */

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "Marat";
        String lastName  = "Karachev";
        char gender = 'M';
        int age = 26;
        String companyName = "CapitalOne";
        String jobTitle = ("SDET");
        boolean isFulltime = true;
        boolean isMarried = false;
        double salary = 140_000.5;

        System.out.println("Employee's full name is: "+ firstName +" "+lastName);
        System.out.println(firstName+" "+lastName+ "'gender is: " +gender);
        System.out.println(firstName+" "+lastName+ "'age is: " + age + " years old");
        System.out.println(firstName+" "+lastName+ "'works at: " +companyName);
        System.out.println(firstName+" "+lastName+ "'Job title is: "+ jobTitle);
        System.out.println(firstName+" "+lastName+ "'salary is : $"+salary);
        System.out.println(firstName+" "+lastName+ " is Full time employee: "+isFulltime);
        System.out.println(firstName+" "+lastName+  " is married: "+isMarried);
        System.out.println(firstName+" "+lastName+  "'salary: " +salary);


    }
}
