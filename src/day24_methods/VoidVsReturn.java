package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {

        sayHi();
        System.out.println();

        sayHi2();
        System.out.println(sayHi2());
    }

    public static void sayHi(){
        System.out.println("Hi");
    }
    public static String sayHi2(){
        String str = "Hi"; // local variable
        return str;

    }
}
