package day27_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {


        int a = 5; // primitive data type for variable a

        //Integer a2 = new Integer(10);// not use after Java 9

        Integer a3 = 20; // small to bigger  -- AUTOBOXING
        int a4 = a3; //  bigger to small --- UNBOXING


        System.out.println(a);
        System.out.println(a3); // Integer
        System.out.println(a4); // int


        byte b = 2;
        Byte b2 = b; // Wrapper Class type // Objest Type // Non -Primitive

    }
}
