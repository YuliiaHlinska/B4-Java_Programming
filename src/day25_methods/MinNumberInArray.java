package day25_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class MinNumberInArray {

    public static void main(String[] args) {

        int [] num = {23, 854, 56, 125, 965, 54, 49, -89};
        System.out.println(minNumInArr(num));

        System.out.println(ArrayUtil.minNumInArr(num));
    }

        public static int minNumInArr (int [] arr) {

            int min = 0;
            Arrays.sort(arr);
            min = arr[0];
            return min;

        }

    }


