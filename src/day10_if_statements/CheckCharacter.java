package day10_if_statements;

public class CheckCharacter {

    public static void main(String[] args) {

        char letter = 'V';

//      if(97 <+ letter && letter <= 122){
//      System.out.println("lower case letter");

        if('a' <+ letter && letter <= 'z'){
        System.out.println("lower case letter");
        }


        if('A' <= letter && letter <= 'Z'){
        System.out.println("Upper case letter");
        }

    }
}
