package day26_methods;

public class ArrayIndexOf {

    public static void main(String[] args) {

        int [] num = {12, 34, 6, 78, 34, 9, 33};


        String str = "loopcamp";
        //            01234567
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("o", 3));
        System.out.println(str.indexOf("o", 3, 5));

        System.out.println();
        System.out.println(indexOf(num, 78));
        System.out.println();

        String [] words = {"java", "api", "selenum", "database" };
        System.out.println(indexOf(words, "java"));
        System.out.println(indexOf(words, "loop"));

    }

    public static int indexOf(int [] arr, int num){
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                index = i;
                break;

            }

        }
        return index;
    }

    public static int indexOf(String [] arr, String str){
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(str)){
                index = i;
                break;

            }
        }
        return index;
    }

}
