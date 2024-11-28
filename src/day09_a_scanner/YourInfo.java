package day09_a_scanner;

import java.util.Scanner;

public class YourInfo {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your favorite book: ");
        String nameOfBook = key.nextLine();

        System.out.print("Please enter your age: ");
        byte age = key.nextByte();

        System.out.print("Please, enter your favorite long number: ");
        long favoriteLong = key.nextLong();

        System.out.println("Information you entered: ");
        System.out.println("\t" + nameOfBook);
        System.out.println("\t" + age);
        System.out.println("\t" + favoriteLong);

    }
}
