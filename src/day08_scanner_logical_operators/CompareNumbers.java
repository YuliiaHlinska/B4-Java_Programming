package day08_scanner_logical_operators;


import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        // Scanner reference  = create the Scanner object
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please enter two numbers");
        System.out.print("\tNumber 1: ");
        int num1 = keyboard.nextInt();

        System.out.print("\tNumber 2: ");
        int num2 = keyboard.nextInt();

        boolean areNumEqual = num1==num2;
        System.out.println("\nIs number one " + num1 + " is equal to number two " + num2 + ": " + areNumEqual);






    }
}
