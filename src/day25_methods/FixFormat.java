package day25_methods;
/*
  create a method will accept a String and return a String in proper format.
    Proper format is:
        First character starting as uppercase and the rest as lowercase

    Ex:
    Input:
        jamES

    Output:
        James
 */

public class FixFormat {
    public static void main(String[] args) {

        System.out.println(fixFormat("MICKY"));
        String name = "TOM";
        String fixedName = fixFormat(name);
        System.out.println( fixedName );


    }

    public static String fixFormat (String input){

        String result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;
    }
}
