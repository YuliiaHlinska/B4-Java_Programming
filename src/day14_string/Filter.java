package day14_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the message: ");
        String message = input.nextLine().trim().toLowerCase();

        //message = message.trim().toLowerCase();

        boolean hasBadPhrase = message.contains("java is bed") || message.contains("quit") || message.contains("have fun") || message.contains("crying");

        if(hasBadPhrase){
            System.out.println("Message failed to send!");
        } else{
            System.out.println(message + "Message sent");
        }

    }
}
