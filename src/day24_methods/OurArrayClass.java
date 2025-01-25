package day24_methods;
/*

    all will accept array argument

    create a method that will print the first element
    create a method that will print the last element
    create a method that will print the middle element/s
        length matters -> if even - there are two middle, for odd there is one middle

 */

public class OurArrayClass {
    public static void main(String[] args) {

        int [] num1 = {213, 45, 23, 65, 87, 98, 43}; // 7  Odd
        int [] num2 = {54, 75, 5678, 234, 23, 54, 2, 55}; // - 8 Even


        arrayFirstelement(num1);
        arraylastElement(num1);
        arrayMisElements(num1);
        arrayMisElements(num2);
    }

    public static void arrayFirstelement(int [] arr){
        System.out.println("First value of the array: " + arr[0]);
    }

    public static void arraylastElement(int [] arr){
        System.out.println("Last value in array: " + arr[arr.length-1]);

    }

    public static void arrayMisElements(int [] arr){
        if(arr.length%2 ==0){
            System.out.println("Middle First: " + arr[arr.length/2-1]);
            System.out.println("Middle Second: " + arr[arr.length/2]);
        }else {
            System.out.println("Middle: " + arr[arr.length/2]);
        }

    }
}
