package day19_nested_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter multi words sentence: ");
        String str = input.nextLine().trim().toLowerCase(); // Today is SUNDAY
        String camelCase = "" + str.charAt(0);

        // find the space + get the next one letter + make it upper case
        // if it space, get the current letter and make it  uppercase and concate
        // if it is not space, get the current one and concate as it is

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == ' '){
               camelCase += ("" + str.charAt(i)).toUpperCase();
            } else {
                camelCase += str.charAt(i);
            }
        }
        camelCase = camelCase.replace(" ","");
        System.out.println(camelCase);

        /*
            TODO: Practice Task
                Implement this code with while loop
                    Hint: while loop condition - continue as long as there space
         */


    }
}
