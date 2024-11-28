package day09_a_scanner;

import java.util.Scanner;

/*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
 */
public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the temperature: ");
        int temp = input.nextInt();

        if(temp>=70){
            System.out.println("It's a nice day. \n Go outside, but with your laptop to code Java.");
        } else {
            System.out.println("Its too cold. \n Code more java.");
        }
    }
}
