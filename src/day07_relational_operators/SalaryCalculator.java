package day07_relational_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double baseSalary = 100_000.00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTaxAmount, federalTaxAmount, totalTaxAmount, salaryAfterTax;

        stateTaxAmount = baseSalary * stateTaxRate;
        federalTaxAmount = baseSalary * federalTaxRate;
        totalTaxAmount = stateTaxAmount + federalTaxAmount;
        salaryAfterTax = baseSalary - totalTaxAmount;

        String taxReport = "Tax Info: \n\tBase Salary: \t\t$" + baseSalary + "\n\tState Tax Rate: \t" + stateTaxRate + "\n\tFederal Tax Rate: \t" + federalTaxRate + "\n\t------------------------------\n\tAfter Tax: \t\t\t$" + salaryAfterTax;

        System.out.println(taxReport);









    }
}
