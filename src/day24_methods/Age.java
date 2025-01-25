package day24_methods;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the year you were born: ");
        int userBirthYear = input.nextInt();
        calculateAge(userBirthYear);

    }
    public static void calculateAge(int year){

        System.out.println("Your age: " + (2024 -year));
        System.out.println("Your age: " + (Year.now().getValue() -year));

    }
}
