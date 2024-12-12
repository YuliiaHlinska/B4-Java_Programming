package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /***
     * This method returns us the min value in the given int Array
     * @param arr given array
     * @return MIN value in int array
     */
    public static int minNumInArr (int [] arr) {

        int min = 0;
        Arrays.sort(arr);
        min = arr[0];
        return min;

    }
    /***
     * This method returns us the max value in the given int Array
     * @param arr given array
     * @return MAX value in int array
     */
    public static int maxNumInArr (int [] arr) {

        int max = 0;
        Arrays.sort(arr);
        max = arr[arr.length -1];
        return max;

    }

    /***
     * This metthod returns boolean in given int array contains the given number
     * @param arr given int array
     * @param num given int number
     * @return boolean, contains or not
     */
    public static boolean contains (int [] arr, int num){
        boolean result = false;

        for (int each : arr){
            if(each == num){
                result = true;
                break;
            }
        }


        return result;

    }
}
