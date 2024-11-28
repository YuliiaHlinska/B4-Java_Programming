package day12_switch_statements;
/*
    Take a number and print the number as the word version
    1 -> one
    2 -> two
    ...
 */

import java.util.Scanner;

public class NumberInWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the number: ");
        int num = input.nextInt();

        if(num >=1 && num <=3){
            if (num ==1 ){
                System.out.println("One");
            } else if (num ==2) {
                System.out.println("Two");
            } else if (num == 3) {
                System.out.println("Three");
            }
        } else {
            System.out.println("You are out of the range");
        }


    }
}
