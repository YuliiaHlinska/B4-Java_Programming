package day25_methods;

import java.util.Scanner;

/*
    ask the user to give you a number between 1 and 10
    and print the String version of giving number
       EX:
             5
             five

             0
              not valid

 */
public class NumberWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, give you a number between 1 and 10: ");
        int userInput = input.nextInt();

        numAsWord(userInput);
        System.out.println(numAsWord2(userInput));
        String str = numAsWord2(userInput);
        System.out.println(str);


    }

    public static void numAsWord(int input1){
        String [] nums = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        if(input1 < 1 || input1 > 10){
            System.out.println("Not valid");
        }else {
            System.out.println(nums[input1 - 1]);
        }


    }
    public static String numAsWord2 (int input2){ // 3

        String [] numsAsWord =  {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        //                         0      1       2       3        4      5        6       7       8        9

        String result = "";


        // num < 1 || num > 10
        if (input2 < 1 || input2 > 10 ){
            result = "Not valid";
        } else {
            result = numsAsWord[input2-1];
        }

        return result;
    }

    }

//                This will do the same thing as above but we stored all values into ONE BIG CONTAINER - array, and used indexes
//        if (input == 1) {
//            System.out.println("One");
//        } else if (input == 2) {
//            System.out.println("Tow");
//        } else if (input == 3) {
//            System.out.println("Three");
//        }
//        //..... continue until 10
//        else {
//            System.out.println("Not valid ");
//        }
//        This is just to show that else-if can be done with switch statement as well
//        switch (userInput) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;   //..... continue until 10
//            default:
//                System.out.println("Not valid");
//        }







