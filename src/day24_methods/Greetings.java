package day24_methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

//        String name = "Tom";
//
//        System.out.println("Hello" + name+ "! How are you?");

        sayHello();
        sayHello2("Tom");
        sayHello2("Micky");
        sayHello2("Mike");


        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userNAme = input.nextLine();
        sayHello2(userNAme);
    }

    public static void sayHello (){
        String name = "Tom";
        System.out.println("Hello " + name+ "! How are you?");

    }
    public static void sayHello2 (String name){
       // String name = "Tom";
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hello " + name+ "! How are you?");

    }
}
