package day14_string;

/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases it is not valid, tell the reason why

 */
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, provide the website: ");
        String website = input.next().toLowerCase();

        boolean isValidBegin = website.startsWith("www");
        //System.out.println(isValidBegin);

        boolean isValidEnd = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".net");

        if(isValidBegin && isValidEnd){
            System.out.println("It's valid website. ");
        }else{
            System.out.println("Invalid website");

            if(!isValidBegin){
                System.out.println("\tIt's invalid beginning");
            }
            if(!isValidEnd){
                System.out.println("\tInvalid end");
            }
        }

    }
}
