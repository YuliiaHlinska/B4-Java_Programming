package my_utilities;

public class StringUtil {

    /**
     * This method fixes the format of the nam
     *
     * @param input -is provided name
     * @return the fixed format
     */
    public static String fixFormat(String input) {
        String result = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        return result;
    }

    /**
     * This method calculates how many times the given letter is in the given string
     *
     * @param str    given String
     * @param letter given letter
     * @return the number of the occurence of letter in a String
     */
    public static int frequencyOfLettters(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method will return us the reversed version of giving String
      * @param word given String
     * @return the reversed version of String
     */
    public static String reverse (String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    /**
     * This method finds the character which are in the String more thant once.
     * @param str is the given String
     * @returns the letter which occurs more than once
     */
    public static String duplicateCharacters (String str) {

        String unique = "";
        String duplicates = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachLetterLoop1 = str.charAt(i);

            if (unique.contains(eachLetterLoop1 + "")) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char eachLetterLoop2 = str.charAt(j);
                if (eachLetterLoop1 == eachLetterLoop2) {
                    count++;
                }
            }

            if (count > 1) {
                duplicates += eachLetterLoop1;
            }

            if (!unique.contains(eachLetterLoop1 + "")) {
                unique += eachLetterLoop1;
            }
        }
        return duplicates;
    }

    /**
     * This method return us the unique characters of our String
     * @param str - given String
     * @return -  letters from String which occurs only once
     */
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
