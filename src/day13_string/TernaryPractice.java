package day13_string;

public class TernaryPractice {

    public static void main(String[] args) {

        // If the number is less than 10 and bigger that or equal -9, then print "number is single digit", else "number is multi digit"

        int num = 10;

        //OPTION 1 - with IF -Else
        if(num < 10 && num >=-9){
            System.out.println("Number is single digit");
        } else {
            System.out.println("Number is multi digit");
        }
        System.out.println("_____________");

        // OPTION 2 - TERNARY
        System.out.println( (num < 10 && num >=-9) ? "Number is single digit" : "Number is multi digit");

        System.out.println("________________");

        // JUst interesting example of reading a code

        System.out.println(num % 2 == 0 ? (num < 10 && num >= -9) ? "Number is single digit" : "Number is multi digit" : "TEST" );

        // ALWAYS try to find the CORRECT syntax if you have multiple ternary used together.
        // condition ? trueValue : falseValue



    }
}
