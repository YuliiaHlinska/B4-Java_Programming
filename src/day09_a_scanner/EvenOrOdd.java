package day09_a_scanner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Please, enter a number: ");
        int num = input.nextInt();

       boolean isEven =  num % 2 == 0; //even
       boolean isOdd = num % 2 == 1; //Odd
        // boolean isOdd = num % 2 != 0; another way of odd

        System.out.println(num + " is even: " + isEven);
        System.out.println(num + " is odd: " + isOdd);





    }
}
