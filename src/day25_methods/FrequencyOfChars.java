package day25_methods;

import my_utilities.StringUtil;

public class FrequencyOfChars {

    public static void main(String[] args) {
        System.out.println(frequencyOfLettters("apple", 'p'));
        System.out.println(frequencyOfLettters2("apple", 'e'));

        StringUtil.frequencyOfLettters("apple", 'l');

    }

    public static int frequencyOfLettters (String str, char letter){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter){
                count ++;
            }
        }
        return count;
    }

    public static int frequencyOfLettters2 (String str, char letter){
        int count = 0;

        //char [] arr = str.toCharArray();
        for (char each :str.toCharArray()){
            if (each == letter){
                count ++;
            }
        }
        return count;
    }
}
