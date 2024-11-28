package day09_a_scanner;

/*
    Write a program that asks the user to enter 3 angle numbers ( can be decimal numbers )
    Determine if the angles make a triangle,
        which means the angles add to 180.0
    and Determine if the angles make a circle,
        which means the angles add to 360.0
 */
import java.util.Scanner;

public class Angels {

    public static void main(String[] args) {
         Scanner key = new Scanner (System.in);
         boolean isTriangle, isCircle;

        System.out.println("Enter 3 angels (in decimals): ");
        double angel1 = key.nextDouble();
        double angel2 = key.nextDouble();
        double angel3 = key.nextDouble();

        isTriangle = (angel1 + angel2 + angel3) == 180;
        isCircle = (angel1 + angel2 + angel3) == 360;

        System.out.println("Its triangle: " + isTriangle);
        System.out.println("Its cyrcle: " + isCircle);



    }
}
