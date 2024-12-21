package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {

    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 2, 4, 62,23,9));
        System.out.println(list1);

        //sort
        Collections.sort(list1);
        System.out.println(list1);

        //reverse
        Collections.reverse(list1);
        System.out.println(list1);

        //max, min
        System.out.println(Collections.min(list1));
        int maxInList = Collections.max(list1);
        System.out.println(maxInList);

        //swap
        Collections.swap(list1, 1, list1.size()-1);
        System.out.println(list1);

        //frequency
        String str = "loopcamp";
       ArrayList<String> letterList = new ArrayList<>( Arrays.asList(str.split("")));
        System.out.println(letterList);

        // find how many times I have element
        System.out.println(Collections.frequency(letterList, "o"));
        System.out.println(Collections.frequency(letterList, "p"));




    }
}
