package day13_string;

import java.util.Scanner;

public class ChooseLanguage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, choose one of the options below: ");
        System.out.print("\t 1- English \n\t 2- Spanish \n\t 3- Turkish\n\t 4 - Ukrainian\n\t 5 - French\n\t 6- Azerbaijan\n\n\tYour option: ");
        int num = input.nextInt();

        // OPTION 1 - with else if
        if(num == 1){
            System.out.println("Hello, thank you for you call");
        }else if (num==2){
            System.out.println("Holla, grasias");
        }else if (num==3){
            System.out.println("Merhaba, araginiz");
        } else if (num == 4) {
            System.out.println("Pruvit, dzykuy za vash dzvinok");
        } else if (num ==5 ) {
            System.out.println("Merci, your votre appel");
        } else if (num ==6) {
            System.out.println("Salam, zeng ettiginiz");
        }else{
            System.out.println("We will use English by default");
        }
        System.out.println("_____________");

        // OPTION 2 - with switch
        String message;
        switch (num){
            case 1:
                message = "\t\thello, thanks for your call";
                break;
            case 2:
                message = "\t\thola, gracias para llamar";
                break;
            case 3:
                message = "\t\tmerhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                message = "\t\tprivet, spasibo za vash zvonok";
                break;
            case 5:
                message = "\t\tMerci ,pour votre appel";
                break;
            case 6:
                message = "\t\tsalam, zeng ettiginiz ucun mennatdariq";
                break;
            default:
                message = "\t\tWe will use English by default";

        }
        System.out.println(message);
        // execution goes from MATCHING ONE and all the to first break; if no break exists, it will go all the way end of switch.


    }
}
