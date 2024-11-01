package day08_scanner_logical_operators;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isCriminal = false;
        int age = 49;

        boolean isEligible = isCitizen && !isCriminal && age >=18;
        System.out.println(name + " is Eligible to vote: " + isEligible);

        System.out.println("---------------------------------");

        name = "James Bond";
        isCitizen = true;
        isCriminal = true;
        age = 18;

        isEligible = isCitizen && !isCriminal && age >= 18;

        System.out.println(name + " is eligible to vote: " + isEligible);


    }
}
