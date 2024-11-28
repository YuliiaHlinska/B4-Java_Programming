package day11_if_statements;

public class Ternary {

    public static void main(String[] args) {

        int a = 7;
        String result;

        // 1. With if single
        if(a % 2 == 0){
            result = " Even number";
            System.out.println(result);
        } else {
            result = "Odd number";
            System.out.println(result);
        }

        // with TERNARY

        result = a % 2 == 0 ? "Even number (Ternary)" : "Odd number (Ternary)";
        System.out.println(result);

        System.out.println("-------------------------");

        int n = 50;
        System.out.println(50 > 0 ? "Positive" : "Negative");

        String str = 50 < 0 ? "+" : "-";
        System.out.println(str);
    }
}
