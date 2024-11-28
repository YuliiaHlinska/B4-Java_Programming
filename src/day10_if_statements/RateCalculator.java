package day10_if_statements;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please, enter your annual salary: $");
        double salary = keyboard.nextDouble();
        double hourlyRate;

        System.out.print("How many hours she?he works in a week? ");
        int hoursPerWeek = keyboard.nextInt();

        // How many hours working in a year ---> hours per week * 52 (weeks in a year)
        hourlyRate = salary / (hoursPerWeek * 52);

        System.out.println("My annual salary is $:" + salary + "\nWork hours per week: " + hoursPerWeek + "\nAnd hourly rate is : $" + hourlyRate);




    }
}
