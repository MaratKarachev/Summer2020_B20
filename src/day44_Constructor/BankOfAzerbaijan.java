package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static day44_Constructor.HumanResources.*; // imports all statics from HumanResource class

/*
 3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
 */
public class BankOfAzerbaijan {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        /*
        list.add(HumanResources.employee1);
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);
         */

        /*
        list.addAll(Arrays.asList(HumanResources.employee1,employee3,employee5));
        //by using static import we are able to import static members, so we can call them without the class name
         */

        list.addAll(Arrays.asList(HumanResources.employee1, HumanResources.employee2, HumanResources.employee3));

        System.out.println("Total number of employees: "+list.size());

        System.out.println("========================================");

        for(Employee each:list){
            System.out.println(each.name+ " : "+each.salary);
        }


    }
}
