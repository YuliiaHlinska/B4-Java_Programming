package day24_methods;

import java.util.Arrays;

/*
Given a 2D array find the average of each inner array
                This is extra if you can: average of the whole array

                Ex:

                    3, 4, 5, 6
                    5, 2, 6
                    10, 20, 30
 */
public class AverageOfEach {
    public static void main(String[] args) {

        int [] [] numbers = {{3, 4, 5, 6},{5, 2, 6},{10, 20, 30}};

        double totalSum = 0;
        int totalLenght = 0;

        for (int [] eachArray: numbers){
            double sumEachArray = 0;
            //System.out.println(Arrays.toString(eachArray));

            for (int eachElement : eachArray){
               // System.out.println(eachElement);
                sumEachArray += eachElement;
            }

            totalSum += sumEachArray;
            totalLenght += eachArray.length;

            System.out.println("Average of " + Arrays.toString(eachArray) + " is: " + sumEachArray/eachArray.length);

        }
        System.out.println("Average of : " + Arrays.deepToString(numbers) + " is: " + totalSum / totalLenght);

        }

}
