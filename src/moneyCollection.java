import java.util.Scanner;
import java.util.Date;

//This is now a new class, I thought it would be good to have a method but turns out a class might just work better
public class moneyCollection {
    public static double collectionAmount(){
        //Creating the date object
        Date todayDate = new Date();

        //Creating the scanner for the amount
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double moneyCollected = newScanner.nextDouble();

        //Printing out everything that was collected
        System.out.println("Today " + todayDate + " You collected: " + moneyCollected);


        //returning the money that was collected at set date to be used elsewhere
        return moneyCollected;
    }
    public static void totalCollected(){
        
    }
}
