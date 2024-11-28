package day14_string;

public class EmptyOrBlank {

    public static void main(String[] args) {
        String str = "new word";

        System.out.println(str.isEmpty());

        str = " "; //reassign str container
        System.out.println(str.isEmpty());
        System.out.println(str.length()); //1

        str = "";
        System.out.println(str.isEmpty()); //completely empty
        System.out.println(str.length()); //0

        //Ternary
        System.out.println((str.length() == 0) ? "There is no character " : "There are some charectres");

        System.out.println("----------------");

        // str = "";  // ONLY CASE which will be tru for both
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

        System.out.println("----------------");
        str = "Java is fun";
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());


        System.out.println("----------------");
        str = "     "; // ONLY BLANK SPACE
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());


        System.out.println("----------------");
        str = " "; // ONLY BLANK SPACE
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());




    }
}
