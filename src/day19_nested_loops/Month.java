package day19_nested_loops;

/*
     1 month - 4 weeks
     each week - 7 days

     week 1
     day 1
     day 2
     day 3
     day 4
     day 5....

     week 2
     day 1
     day 2
     day 3
     day 4
     day 5....

 */
public class Month {
    public static void main(String[] args) {


        for (int i = 1; i <=4 ; i++) {
            System.out.println("Week: " + i);

            for (int j = 1; j <=7 ; j++) {
                System.out.println("\tDay: " + j);

                for (int k = 1; k <=24 ; k++) {
                    System.out.println("\t\tHour: " + k);
                }
                System.out.println();
            }
            System.out.println();
        }

        // For each day can you print: Hour 1, Hour 2, Hour 3....until Hour 24
    }
}
