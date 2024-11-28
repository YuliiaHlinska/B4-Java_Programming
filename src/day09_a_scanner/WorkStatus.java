package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String firstName = key.next();

        System.out.print("Please enter your last name: ");
        String lastName = key.next();

        System.out.println("Are you employed (true/false); ");
        boolean isEmployed = key.nextBoolean();

        System.out.println("Are you a student (true/false): ");
        boolean isStudent = key.nextBoolean();


        System.out.println( "Information about the person: " + firstName + " " + lastName + "\n\t Is employed: " + isEmployed + "\n \t Is student: " + isStudent);

    }
}
