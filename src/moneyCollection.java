import java.util.Scanner;
import java.util.Date;

//This is now a new class, I thought it would be good to have a method but turns out a class might just work better
public class moneyCollection {
    public static void collectionAmount(){
        //Creating the date object
        Date todayDate = new Date();

        //Creating the scanner for the amount
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double moneyCollected = newScanner.nextInt();

        //Printing out everything that was collected
        System.out.println("Today " + todayDate + " You collected: " + moneyCollected);

        //Creating the array list to have all the collection amounts
        double [] collectionAmounts = new double[25];


    }
    //This method below takes the cases total collected
    public static void totalCollected(){
        Scanner inputCases = new Scanner(System.in);
        int [] casesCollected = new int[5];
        /** Creating the array that will hold the amount of cases collected in each element.
         * The each element of the array is the responding to each month. Element 0 is for Jan 2021.
         **/

        /** for(int i = 0; i < casesCollected.length; i++){
            System.out.println("Enter the numbers");
            casesCollected[i] = inputCases.nextInt();
        }
        **/
        //Creating a while loop to go through the array and check if there is an element. If there is none then it stops

    }
}
