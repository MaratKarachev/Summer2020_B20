package day52;

import java.util.ArrayList;
import java.util.Arrays;

/*
 4. create a class called Google
            create 5 objects of the Tester and 5 objects of Developer
            create an arrayList of Tester and an ArrayList of Developer, store those 5 objects of the Tester & Developers
            use for each loop to iterate Tester & Developer objects from in those arrayLists
                print out the tester & developer who has the highest salary
 */
public class Google {
    public static void main(String[] args) {


        Tester tester1 = new Tester("Marat", 26, 'M', 12345, "Senior SDET", 120_000);
        Tester tester2 = new Tester("Altay", 26, 'M', 123456, "Senior SDET", 130_000);
        Tester tester3 = new Tester("Tetiana", 26, 'F', 1234567, "Senior SDET", 140_000);
        Tester tester4 = new Tester("Diana", 26, 'F', 12345678, "Senior SDET", 150_000);

        Developer developer1 = new Developer("Marat", 26, 'M', 12345, "Senior Dev", 120_000);
        Developer developer2 = new Developer("Altay", 26, 'M', 123456, "Senior Dev", 130_000);
        Developer developer3 = new Developer("Tetiana", 26, 'F', 1234567, "Senior Dev", 140_000);
        Developer developer4 = new Developer("Diana", 26, 'F', 12345678, "Senior Dev", 150_000);


      ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1, developer2, developer3, developer4));
      ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1, tester2, tester3, tester4));

      Tester highestPaidTester = tester1;
      for(Tester each: testers) {
          if (each.salary > highestPaidTester.salary) {
              highestPaidTester = each;
          }
      }
        System.out.println(highestPaidTester.name+ " is the highest paid tester and salary is: " +highestPaidTester.salary);

        System.out.println("=============================================================================");

          Developer highestPaidDeveloper = developer1;
          for(Developer each: developers){
              if(each.salary>highestPaidDeveloper.salary){
                  highestPaidDeveloper=each;
              }
      }
        System.out.println(highestPaidDeveloper.name + " is the highest paid developer and salary is: " +highestPaidDeveloper.salary+"\n"+highestPaidDeveloper);
    }
}



