package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of array 1: ");
        int sizeArr1 = input.nextInt();

        int [] arr1 = new int [sizeArr1];

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print("Please, enter value for index: " + i + ": ");
            arr1 [i] = input.nextInt();
        }
        System.out.print("How many additional elements you want to add to array: ");
        int additionalElem = input.nextInt();

        int [] arr2 = Arrays.copyOf(arr1, arr1.length + additionalElem);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = arr1.length; i < arr2.length; i++) {
            System.out.print("Please, enter the value for index " + i + ": ");
            arr2[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));



    }
}
