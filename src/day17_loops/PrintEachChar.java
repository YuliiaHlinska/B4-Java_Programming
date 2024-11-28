package day17_loops;

public class PrintEachChar {

    public static void main(String[] args) {
        String word = "loopcamp";
        //             01234567

        System.out.println(word.charAt(0)); // l
        System.out.println(word.charAt(1)); // o
        System.out.println(word.charAt(2)); // o
        System.out.println(word.charAt(3)); // p
        System.out.println(word.charAt(4)); // c
        System.out.println(word.charAt(5)); // a
        System.out.println(word.charAt(6)); // m
        System.out.println(word.charAt(7)); // p

        System.out.println("--------------------");


        // from beginning to the end
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        System.out.println("--------------------");

        // from the end to beginning

        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.println(word.charAt(i));

        }
        System.out.println("--------------------");

        // reverse word
        String reversed ="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
           // System.out.println("Reversed word: " + reversed); will show us adding every char every circle
        }
        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversed);



    }
}
