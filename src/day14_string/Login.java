package day14_string;

import java.util.Scanner;
/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */


public class Login {
    public static void main(String[] args) {

        String expectedUserName = "java@gmail.com";
        String expectedPassword = "loopcamp";

        Scanner input = new Scanner(System.in);
        System.out.print("Please, provide your username: ");
        String actualUserName = input.next();
        // String actualUsername = key.next().toLowerCase();

        System.out.print("Please, provide your password: ");
        String actualPassword = input.next();

        // to be able to login
//      1. username has to match without case sensitiveness --- >  inputUsername.equalsIgnoreCase(expectedUsername) --- > boolean
//      2. password needs to be 8 character long            --- >  inputPassword.length() == 8                      --- > boolean
//      3  password needs to match exactly                  --- >  inputPassword.equals(expectedPassword)           --- > boolean


        boolean isValid = actualUserName.equalsIgnoreCase(expectedUserName) && actualPassword.length() == 8 && actualPassword.equals(expectedPassword);

        if(isValid){
            System.out.println("Logged In");

        }else {
            System.out.println("You have entered invalid user name or password. ");
        }
        // TODO: HOMEWORK -- > implement the code to give specific message for specific error.



    }
}
