package day25_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {

    public static void main(String[] args) {

        StringUtil.fixFormat("jaMES");
        System.out.println(StringUtil.frequencyOfLettters("loopcamp", 'o'));


        System.out.println(StringUtil.reverse("loopcamp"));

        System.out.println(StringUtil.duplicateCharacters("apple"));

        System.out.println(StringUtil.uniqueCharacters("loopcamp"));

    }

    }

