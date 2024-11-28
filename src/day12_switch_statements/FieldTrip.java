package day12_switch_statements;

import java.util.Scanner;

/*
    Have tree variables
        - grade
        - teacher
        - location
        - number of groups

        Based on the grade make a decision where the location is going to be and what the number of groups will be and who the teacher will be.
 */
public class FieldTrip {

    public static void main(String[] args) {
        int grade;
        String teacherName;
        String location;
        int numOfGroup;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the grade you want to get a field trip info: ");
        grade = input.nextInt();

        // grade from 1 to 3 ----- > Mr. Nadir | Apple Orchard  | 3
        // grade 1 --- >
        // grade 2 --- >
        // grade 3 --- >
        // ....
        // all the other grades -- > Mr. Benjamin | Fire Works | 10

        if(grade >=1 && grade <=3){
            if (grade == 1){
                teacherName = "Nadir";
                location = "Apple Orchand";
                numOfGroup = 1;
            } else if (grade == 2) {
                teacherName = "Diana";
                location = "Orange";
                numOfGroup = 2;
            } else if (grade == 3) {
                teacherName = "Feyruz";
                location = "Bannana";
                numOfGroup = 3;
            } else{
                teacherName = "Iryna";
                location = "Pineapple";
                numOfGroup = 4;
            }

        } else{
            teacherName = "N/A";
            location = "N/A";
            numOfGroup = 0;
        }

        System.out.println("\nHere is field trip info for grade " + grade);
        System.out.println("\tTeacher Name: " + teacherName);
        System.out.println("\tLocation: " + location);
        System.out.println("\tNumber of groups: "+ numOfGroup);



    }
}
