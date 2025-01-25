package day25_methods;

import my_utilities.StringUtil;

public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("apple"));

        System.out.println(StringUtil.uniqueCharacters("loopcamp"));
    }

    public static String uniqueCharacters(String str){
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(StringUtil.frequencyOfLettters(str, eachChar) == 1){
                unique += eachChar;
            }
        }
        return unique;
    }
}
