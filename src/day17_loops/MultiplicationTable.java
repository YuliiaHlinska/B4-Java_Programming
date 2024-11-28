package day17_loops;

import java.util.Scanner;

/*

    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            4 x 3 = 12
            4 x 4 = 16
            ..
            4 x 10 = 40



 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the number: ");
        int num = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num*i));

        }


    }
}
