package day10_if_statements;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter the product name: ");
        String product = key.nextLine();

        System.out.print("Please enter the price: $");
        double price = key.nextDouble();

        System.out.print("Please, enter the quantity: ");
        int num = key.nextInt();

        // If there is any other than nextLine scanner method before nextLine method, we need to handle it with an extra empty nextLine method.
        key.nextLine();

        System.out.print("Please, enter your full name: ");
        String fullname = key.nextLine();

        String orderDetailes = fullname + ", your order for " + num + " " + product + " has beed placed. Your total is $" + (price*num);

        System.out.println(orderDetailes);


    }
}
