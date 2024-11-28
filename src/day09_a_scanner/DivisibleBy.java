package day09_a_scanner;

import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter the number: ");
        int num = key.nextInt();

        boolean isDivisibleBy2 = num % 2 ==0;
        boolean isDivisibleBy3 = num % 3 ==0;
        boolean isDivisibleBy5 = num % 5 ==0;



        System.out.println("Our number: " + num + " is divisible by 2: " + isDivisibleBy2);
        System.out.println("Our number: " + num + " is divisible by 2: " + isDivisibleBy3);
        System.out.println("Our number: " + num + " is divisible by 2: " + isDivisibleBy5);

        // check if the num is divisible by 2 and 3 and 5
       // System.out.println("Our number: " + num + " is divisible by 2 and 3 and 5 : " + (isDivisibleBy5 && isDivisibleBy3 && isDivisibleBy5));
        boolean isDivisibleBy2_3_5 = isDivisibleBy5 && isDivisibleBy3 && isDivisibleBy5;
        System.out.println("Our number: " + num + " is divisible by 2 and 3 and 5 : " + isDivisibleBy2_3_5);


    }
}
