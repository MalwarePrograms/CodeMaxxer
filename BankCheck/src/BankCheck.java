//Aristotle Espiritu Santo
//September, 11, 2024
// Lab 6
//This program simulates and calculates a bank loan
import java.util.Scanner;
public class BankCheck
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double loanCharge = 0;
        double loanReturned = 0;

            System.out.println("Hello! How much would you like to take out "
                                + "for a loan?");
            double loanAmount = keyboard.nextInt();

            //If loan is 10 dollars or less
            if (loanAmount <= 10)
            {
                loanCharge = 1;
                loanReturned = loanAmount - loanCharge;
            }

            //If loan is between 10 and 100 dollars
            else if (loanAmount > 10 && loanAmount <= 100)
            {
                loanCharge = loanAmount * 0.1;
                loanReturned = loanAmount - loanCharge;
            }

            //If loan is between 100 and 1000 dollars
            else if (loanAmount > 100 && loanAmount <= 1000)
            {
                loanCharge = loanAmount * 0.05 + 5;
                loanReturned = loanAmount - loanCharge;
            }

            //If loan is over 1000 dollars
            else if (loanAmount > 1000)
            {
                loanCharge = loanAmount * 0.01 + 40;
                loanReturned = loanAmount - loanCharge;
            }

            //Prints the receipt
            System.out.println("Receipt:");
            System.out.println("Amount of check:" + loanAmount);
            System.out.println("Service fee:" + loanCharge);
            System.out.println("Amount returned:" + loanReturned);
    }
}
                                                                                //