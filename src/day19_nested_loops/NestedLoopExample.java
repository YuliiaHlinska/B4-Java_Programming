package day19_nested_loops;

public class NestedLoopExample {

    public static void main(String[] args) {

        System.out.println("Hello Loopcamp");
        System.out.println("Hello Loopcamp");
        System.out.println("Hello Loopcamp");
        System.out.println("Hello Loopcamp");
        System.out.println("Hello Loopcamp");


        System.out.println("___________");

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Hello Loopcamp");
        }
        System.out.println("___________");

        /* TASK
        Hello Galaxy
        Hello Moon
        Hello Moon

        Hello Galaxy
        Hello Moon
        Hello Moon

        Hello Galaxy
        Hello Moon
        Hello Moon

         */



        for (int j = 1; j <=3 ; j++) {
            System.out.println("Hello Galaxy");
        for (int i = 1; i <=2 ; i++) {
            System.out.println("Hello Moon");
        }
            System.out.println();
        }

    }
}
