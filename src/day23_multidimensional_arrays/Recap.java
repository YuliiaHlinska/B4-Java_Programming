package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {

    public static void main(String[] args) {

        int [] arr1 = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 60, 90};

        // how to print arrays
        String str = Arrays.toString(arr1);
        System.out.println(str);
        System.out.println(Arrays.toString(arr2));

        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Before sorting " + isEqual);
        System.out.println();

        //how to sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("After the sorting: " + Arrays.equals(arr1, arr2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        // join method form String class ?? convert array to String
        String [] strArr = {"java", "selenium", "jira", "sprint", "release"};
        String str2 = String.join("", strArr);
        System.out.println(str2);
        System.out.println(String.join("##", strArr));

        //how to convert String to String array
        String str3 = "Today is Thursday";
        String [] str3Arr = str3.split(" ");
        System.out.println(Arrays.toString(str3Arr));

        // how to convert String to char Array
        String str4 = "loopcamp";
        char [] str4Arr = str4.toCharArray();
        System.out.println(Arrays.toString(str4Arr));







    }
}
