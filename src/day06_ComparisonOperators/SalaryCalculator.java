package day06_ComparisonOperators;
/*
Salary: rate*weeklyHours *48
TotalTax: salary * (stateTaxRate + federalTaxRate)
salaryAfterTax:salary-totalTax
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        double rate = 55;
        double stateTaxRate =0.08;
        double federalTaxRate = 0.22;
        int weeklyHours =48;

        double salary = rate*weeklyHours*48;
        System.out.println(salary);

        double TotalTax = salary*(stateTaxRate+federalTaxRate);
        System.out.println(TotalTax);

        double salaryAfterTax= salary-TotalTax;
        System.out.println(salaryAfterTax);

        System.out.println("Salary before tax: " +salary+" USD");
        System.out.println("Total tax a year: " +TotalTax+" USD");
        System.out.println("Salary after tax: " +salaryAfterTax+ " USD");

    }
}
