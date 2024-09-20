//Aristotle Spencer Espiritu Santo
//September, 4, 2024
//Lab 5
//This program asks a price to buy with one dollar and calculates change
import java.util.Scanner;

public class VendingMachineChange
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner (System.in);

            //Asks for item price
            System.out.println("Enter the price of your item (in cents) "
                + " between 35 cents and a dollar (in 5 cent increments.");
            int priceOfItem = keyboard.nextInt();
            System.out.println("You used a dollar to buy it. Your change "
                + "is...");

            int remainingChange = 100 - priceOfItem;

            if (remainingChange==100)
            {
                System.out.println("None!");
                System.exit(0);
            }

            //If the price is less than a dollar
            else if (remainingChange < 100)
            {

                //Calculates Quarters
                if (remainingChange >= 25)
                {

                    int coinAmount = remainingChange / 25;
                    int placeHolderChange = remainingChange % 25;
                    System.out.println(coinAmount + " quarters");
                    remainingChange = placeHolderChange;
                }

            //Calculates Dimes
            if (remainingChange >= 10)
            {

                int coinAmount = remainingChange / 10;
                int placeHolderChange = remainingChange % 10;
                System.out.println(coinAmount + " dimes");
                remainingChange = placeHolderChange;
            }

                //Calculates Nickels
                if (remainingChange >= 5)
                {

                    int coinAmount = remainingChange / 5;
                    int placeHolderChange = remainingChange % 5;
                    System.out.println(coinAmount + " nickels");
                    remainingChange = placeHolderChange;
                }
        }
    }
}