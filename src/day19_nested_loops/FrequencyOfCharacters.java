package day19_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        
        /*
        String apple
        
        count how many times each letter is in a String
        a-1
        p-2
        l-1
        e-1
        
         */
        
        String str = "apple";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
          char outerLetter =  str.charAt(i);
          if(unique.contains("" + outerLetter)){
              continue;
          }

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                if(outerLetter == innerLetter){
                    count ++;
                }
            }
            System.out.println(outerLetter + " - " + count);
            unique += outerLetter;
        }


    }
}
