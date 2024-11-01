package day07_relational_operators;

import java.sql.SQLOutput;

public class GiftCard {

    public static void main(String[] args) {

        double giftCard = 200;

        double item1 = 10;
        double item2 = 25.9;


        System.out.println("I have $" + giftCard + " balance in my gift card.") ;

        System.out.println("I bought a cup for $" + item1);

//        giftCard = giftCard - item1;
//        giftCard -= item1;
//        System.out.println("After purchasing the cup, I have $:" + giftCard + " balance");

        System.out.println("After purchasing the cup, I have $:" + (giftCard -= item1) + " balance");
        System.out.println();
        System.out.println("I bought a T-Shirt for $" + item2);
        System.out.println("After purchasing the T-Shirt, I have $" + (giftCard -= item2) + " balance" );



    }
}
