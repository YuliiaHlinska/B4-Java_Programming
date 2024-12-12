package day25_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {

    public static void main(String[] args) {

        int [] nums ={2,-54, 546,125,45};

        System.out.println(ArrayUtil.minNumInArr(nums));

        System.out.println(ArrayUtil.maxNumInArr(nums));

        System.out.println(ArrayUtil.contains(nums, 546));
        System.out.println(ArrayUtil.contains(nums, 25));
    }
}
