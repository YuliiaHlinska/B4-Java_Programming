package day16_loops;

import java.util.Scanner;
/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
 */

public class MoveFirst {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please, provide the sentences: ");
        String sentence = input.nextLine();

        //substring method (index 1, index 2)
        // we need to find the index of first space ---> sentence.indexOf(" ")

        String part1 = sentence.substring(0, sentence.indexOf(" "));

        String part2 = sentence.substring(sentence.indexOf(" ") + 1);

        System.out.println(part1);
        System.out.println(part2);

        System.out.println(part2 + " " + part1);

        /*
            TODO: Home Practice
                Handle the case where user provides only single word as a sentence.
                If user provides single word -- > print the same word.

                Hint: .contains();
         */



    }
}
