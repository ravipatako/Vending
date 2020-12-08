import java.util.Scanner;
import java.util.Date;

//This is now a new class, I thought it would be good to have a method but turns out a class might just work better
public class moneyCollection {
    public static void collectionAmount(){


        Date todayDate = new Date();
        System.out.println(todayDate);

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double moneyCollected = newScanner.nextDouble();
        System.out.println(moneyCollected);


    }

    public static void totalCollected(){

    }


}
