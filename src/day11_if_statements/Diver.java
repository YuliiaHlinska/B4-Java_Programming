package day11_if_statements;
//You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
//
//        	> Above 90 - Your tank is full
//        	> Above 80 - Still okay
//        	> Above 70 - Don't go too far
//        	> Above 60 - Start to head back
//        	> Above 50 - Be careful now you are at 50%
//
//
//
//		Note: Use Scanner class / write all the conditions to cover all the possibilities for the different input
//
//		Example Output:
//			What is your current oxygen level of in your tank?
//			95
//			You tank is full!

import java.sql.SQLOutput;
import java.util.Scanner;

public class Diver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your current oxygen level of in your tank? ");
        int oxygenLevel = input.nextInt();

        if (oxygenLevel > 90 ) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't go too far");
        } else if ( oxygenLevel > 60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you are at 50%");
        } else {
            System.out.println("See you in heaven");
        }

    }
}
