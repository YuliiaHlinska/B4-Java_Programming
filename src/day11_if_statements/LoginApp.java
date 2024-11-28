package day11_if_statements;

import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int expectedPinCode = 1111;
        int expectedSSNLast4 = 2548;

        int actualPinCode;
        int actualSSNLast4;
        System.out.print("Welcome to ATM.\n\t Please, provide your pincode: ");
        actualPinCode = input.nextInt();
        System.out.print("\tPlease provide the lasrt 4 numbers of SSN: ");
        actualSSNLast4 = input.nextInt();

        System.out.println();

        if (actualPinCode == expectedPinCode && actualSSNLast4 == expectedSSNLast4) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication failed");

            if (actualPinCode != expectedPinCode){
                System.out.println("Incorrect Pin");
            }
            if (actualSSNLast4 != expectedSSNLast4){
                System.out.println("Incorrect SSN");
            }
        }


    }
}
