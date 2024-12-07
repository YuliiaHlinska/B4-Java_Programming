package day24_methods;
/*

    starting from 0 count up to a certain number
    all the numbers until the number input

    method(5) --> 0 1 2 3 4 5

    method(10) --> 0 1 2 3 ... 10

 */
public class CountNumbers {

    public static void main(String[] args) {
        countUpCount(5);
        countUpCount(10);

        int a = 100;
        countUpCount(a);

        countUpCount(-10); // false in a loop, will not reach out this method

    }

    public static void countUpCount(int num){
        for (int i = 0; i <=num ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


}
