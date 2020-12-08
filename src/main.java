import java.util.Scanner;
//Created by Ravi Pathak

/*
 *Hello so if you are reading this then that means you found out about my vending machine
 * This program was creating to be able to allow me to just input my collections and expenses
 * to figure out my monthly profits. Enjoy the work!!
 */

//Seeing if this comment gets to GitHub
public class main{
    public static void main(String args[]){



        Scanner sc = new Scanner(System.in); //creating menu scanner

        //right here is the main menu words
        System.out.println("Welcome to the main menu \n");
        System.out.println("Select from the menu: ") ;
        System.out.println("1 - Input Collection");
        System.out.println("2 - Add cases purchased");
        System.out.println("3 - Get Report");

        System.out.println("Enter Number here :");
        int menu = sc.nextInt(); //creating the variable for the menu selection


        //This is the menu if else statement for
        if (menu == 1)  {
            moneyCollection();
        }
        else if (menu == 2) {
            casesCollected();
        }
        else if (menu == 3) {

        } else {
            System.out.println("Please restart the menu!");
        }


    }
    //This method below will do the tracking for the money that is collected from the machine
   public static double moneyCollection(){
       System.out.println("Please enter the amount that was collected today: ");
       Scanner da = new Scanner(System.in);

       return da.nextInt();
   }
    //This method below will keep track of the cases of soda that are used
   public static int casesCollected (){
       System.out.println("Dope");
        return  0;
   }
}