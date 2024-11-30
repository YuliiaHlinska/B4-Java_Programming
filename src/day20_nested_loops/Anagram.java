package day20_nested_loops;
/*
    Given two Strings determine if they are anagram or not.
    Strings are anagram if they are built up of the same characters
     Ex:
        listen vs silent
            listen  ->  eilnst
            silent  ->  eilnst

        funeral vs  real fun
        a gentleman vs elegant man

     -> anagram
     Hint: look up and use replaceFirst() method
 */
public class Anagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent"; // str2.replaceFirst("l", "");  --- > sient --> sent -- > ent --> en -- >  n -- > ""

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
        }else{
            // take each char from the first String and on every cicle remove that matching char from the second String

            for (int i = 0; i < str1.length(); i++) {
                char eachChar = str1.charAt(i);

                str2 = str2.replaceFirst(eachChar + "", "");

            }
            if(str2.isEmpty()){
                System.out.println("It's Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }

    }
}
