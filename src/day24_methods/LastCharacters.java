package day24_methods;

import java.util.Arrays;

public class LastCharacters {

    public static void main(String[] args) {
        String [][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };

        System.out.println(Arrays.deepToString(words));

        for (String [] eachsingleArray : words){
            String lastChar = "";
            for (String eachElement : eachsingleArray){

                lastChar += eachElement.charAt(eachElement.length()-1);

            }
            System.out.println(lastChar);
        }
    }
}
