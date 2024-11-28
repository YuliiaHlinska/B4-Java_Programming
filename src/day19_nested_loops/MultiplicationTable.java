package day19_nested_loops;

public class MultiplicationTable {

    public static void main(String[] args) {


        /*
        print multiplication

        1*1 = 1
        1*2 = 2

        2*1 = 2
        2*2 = 4

        3*1 = 3
        3*2 = 6
        .....
        10*10...
         */

        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "*" + j + " = " + (i*j)) ;
            }
            System.out.println();

        }
    }
}
