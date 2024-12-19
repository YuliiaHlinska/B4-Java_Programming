package day28_arraylist;

import java.util.Arrays;

/*
 Task:
        	Given a String in the following format take the number part of the generator the html tags.
		Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

		Ex:
			Input:
				div^2
			Output:
				<div></div> <div></div>

		Ex:
			Input:
				li^3
			Output:
				<li></li><li></li><li></li>

 */
public class HtmlGenerator {

    public static void main(String[] args) {
        String str = "div^2";
        System.out.println(htmlGenerator(str));
        System.out.println(htmlGenerator("li^5"));

    }

    public static String htmlGenerator (String str){
        String result = "";

        String [] array = str.replace("^", " ").split(" ");
        //System.out.println(Arrays.toString(array));

        int numOfCycle = Integer.parseInt(array[1]);

        for (int i = 0; i < numOfCycle; i++) {
            result += ("<" + array[0] + "></" + array[0] + ">");
        }

        System.out.println(result);
        return result;
    }
}
