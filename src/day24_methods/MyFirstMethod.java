package day24_methods;

public class MyFirstMethod {
    public static void main(String[] args) {

        System.out.println("Hello world");
        printHelloWord();

        System.out.println("Buy");
        System.out.println("________________");
        printHelloworld50();

    }

    //it is public method
    // it is static
    //it is void method, meand=s doeant return for us anything, just do some action
    // it is not parametirized method
    public static void printHelloWord(){
        System.out.println("Hello world");

    }

    public static void printHelloworld50(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello world");

        }
    }
}
