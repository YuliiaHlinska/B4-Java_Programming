package day24_methods;

public class Car {

    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void openDoor(){
        System.out.println("Opening the door");
    }

    public static void getIntoCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }

    public static void getReady (){
        System.out.println("Put the seatBell on");
        System.out.println("Check the mirrors");
        System.out.println("Turn on the music");
        System.out.println("Put on the navigation");
    }

    public static void startCar(){
        System.out.println("Start the engine");
    }

    public static void drive(){
        System.out.println("Start drive");
    }

    public static void driveInRush(){
        unlockCar();
        getIntoCar();
        startCar();
        drive();
    }

    public static void main(String[] args) {

        unlockCar();
        openDoor();
        getIntoCar();
        getReady();
        startCar();
        drive();

        System.out.println("____________________");
        driveInRush();

    }
}
