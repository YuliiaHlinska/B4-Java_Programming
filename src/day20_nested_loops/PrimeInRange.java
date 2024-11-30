package day20_nested_loops;
/*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, provide the number: ");
        int userNum = input.nextInt();

        for (int i = 1; i <= userNum; i++) {


            int count = 0;
            int singleNum = i; // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10... 50

            for (int j = 1; j <= singleNum; j++) {
                if (singleNum % j == 0) {
                    count++;
                }
            }

            if (count == 2){
                System.out.print(singleNum + " ");
            }


        }

    }
}
