package day32_custom_classes;

import java.sql.SQLOutput;

public class UsePhone {

    public static void main(String[] args) {

        //Phone phone1 = new Phone();

//        phone1.name = "Iphone 16 Pro";
//        phone1.brand = "Apple";
//        phone1.memory = 128;
//        phone1.version = 18.2;


        Phone phone1 = new Phone("Iphone 16 Pro","Apple",128,18.2 );

        System.out.println(phone1);

        System.out.println("_________");

        Phone phone2 = new Phone("Iphone 12 Mini");
        System.out.println(phone2);

        Phone phone3 = new Phone("Iphone 16 Pro Max", "Apple", 512);

        System.out.println(phone3);

        System.out.println("______");


        Phone phone4 = new Phone("Iphone 16 MINI","Apple",512,18.0 );


    }
}
