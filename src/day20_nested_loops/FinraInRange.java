package day20_nested_loops;

import java.util.Scanner;

public class FinraInRange {

    public static void main(String[] args) {

        // range = 50;   1, 2, 3, 5, 6, 7 ......... 50;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a number to get all \"FIN/RA/FINRA\": ");
        int userNumRage = scan.nextInt();


        for (int i = 1; i <= userNumRage; i++) {
            //int num = i; and  instead of i in a future you can use num


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FINRA");
            } else if (i % 3 == 0) {
                System.out.println(i + " - FIN");
            } else if (i % 5 == 0) {
                System.out.println(i + " - RA");
            }

        }




    }

}



/*
    if divisble by 3 --- > FIN
    if divisible by 5 -- > RA
    if divisble by 15 -- > FINRA
 */