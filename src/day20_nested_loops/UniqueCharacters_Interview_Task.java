package day20_nested_loops;

public class UniqueCharacters_Interview_Task {

    public static void main(String[] args) {

        String str = "AbbCD$CSTGF(";
        // Find only the Unique characters
        // "AAbCD$CSTGF("

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachLetter1stLoop = str.charAt(i); // "AAbCD$CSTGF("

            for (int j = 0; j < str.length(); j++) {

                char eachLetter2ndLoop = str.charAt(j); // "AAbCD$CSTGF("

                if(eachLetter1stLoop == eachLetter2ndLoop){
                    count ++;
                }

            }
            if(count == 1){
                System.out.print(eachLetter1stLoop);
            }

        }
    }
}
