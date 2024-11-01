package day08_scanner_logical_operators;

public class GoForWalk {

    public static void main(String[] args) {

        boolean isRaining = true;
        int temperature = 80;


        boolean isGoodToWalk = !isRaining && temperature > 70;
        // should be true in both sides
        // first should be true to execute the second one

        System.out.println("Is it good to go for a walk: " + isGoodToWalk);


    }
}
