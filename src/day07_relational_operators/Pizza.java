package day07_relational_operators;

public class Pizza {

    public static void main(String[] args) {

        String pizzaType = "Pepperoni";
        int numOfSlices = 10;
        int numOfPeople = 3;

        int slicesPerPerson = numOfSlices/numOfPeople;
        int slicesLeftOver = numOfSlices % numOfPeople;
        int slicesLeftOver2 = numOfSlices - (numOfPeople * slicesPerPerson);

        System.out.println(slicesLeftOver);
        System.out.println(slicesLeftOver2);

        String result = "We bought " + pizzaType + " pizza. It has " + numOfSlices + " slices. We are " + numOfPeople + " people and each of us will eat " + slicesPerPerson + " slices and there will " + slicesLeftOver + " slices left over.";

        System.out.println(result);






    }
}
