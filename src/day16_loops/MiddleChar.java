package day16_loops;

public class MiddleChar {

    public static void main(String[] args) {

        String word = "elephant";
        //             012345678
        String mid = "";
        //find mid char
        //if length is even - take 2 chars --. if (word.length() % 2 == 0)
        // if length is odd - take 1 char --- > if (!word.length() % 2 == 0)


        if (word.length() % 2 == 0){
            //mid = 8/2 = 4 -1 =3, mid 2 = 8/2 = 4
            mid = word.substring(word.length()/2 - 1, word.length()/2 + 1);
            // mid = "" + word.charAt( word.length()/2 - 1) + word.charAt( word.length()/2  ); // this will do the same thing as one above
        }else{
            mid = word.substring(word.length()/2, word.length()/2 +1);
            // mid = "" + word.charAt( word.length()/2 ); // this will do the same thing

        }
        System.out.println(mid);
    }
}
