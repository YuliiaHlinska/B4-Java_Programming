package day08_scanner_logical_operators;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();

        int totalNum = num1 + num2 + num3;
        System.out.println("Total = " + totalNum);

        int afterDivisionBy2 = totalNum/2;
        System.out.println("After divided by 2 = " + afterDivisionBy2);

        //add 2
        System.out.println("After divided by 2 = " + (afterDivisionBy2 +2));

        //module by 2
        System.out.println("After divided by 2 = " + (afterDivisionBy2 % 2));


    }
}
