//Aristotle Spencer Espiritu Santo
//August, 27, 2024
//Lab 3
//This program will ask questions about your plant's height.
import java.util.Scanner;

public class GrowAPlant
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Asks the questions
        System.out.println ("What is the current height (in inches) of"
                + " your plant today?");
        int plantNewHeight = input.nextInt();
        System.out.println ("What was the old height (in inches) of your "
                + "plant yesterday?");
        int plantOldHeight = input.nextInt();

        //Gives the answer using the data from the questions
        System.out.println ("Your plant has grown " + (plantNewHeight
                - plantOldHeight) + " inches.");
    }
}