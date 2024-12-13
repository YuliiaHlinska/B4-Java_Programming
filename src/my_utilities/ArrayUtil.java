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

    /***
     * This method return the index of given int num from the given int array
     * @param arr given array
     * @param num given num
     * @return index of value, if not return -1
     */
    public static int indexOf(int [] arr, int num){
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                index = i;
                break;

            }

        }
        return index;
    }

    /***
     * This method returns the index of given String str from the given String array
     * @param arr given String array
     * @param str given String
     * @return the invdex of String value, if not return -1
     */
    public static int indexOf(String [] arr, String str){
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(str)){
                index = i;
                break;

            }
        }
        return index;
    }


    /***
     * This method returns ua the sum of the int elements in given array int
     * @param arr given int array
     * @return sum of the values of int array
     */
    public static int sum (int ... arr){
        int total = 0;
        for (int each : arr){
            total += each;
        }
        return total;
    }
}
