package day05_variables;

public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple";
        String model = "Iphone 16";
        String color = "Yellow";
        double price = 999.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I just bought " + model + " from " + brand);
        System.out.println("Its in the color of " + color +  " and it has " + storage + " GB");
        System.out.println("It has " + sim + "sim card and with the camera being " + hasCamera + ", total price is $" + price);

        System.out.println();

        System.out.println("I just bought " + model + " from " + brand + "\nIts in the color of " + color +  " and it has " + storage + " GB" + "\nIt has " + sim + "sim card and with the camera being " + hasCamera + ", total price is $" + price);

    }
}
