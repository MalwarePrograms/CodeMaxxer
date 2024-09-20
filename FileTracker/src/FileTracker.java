//Aristotle Espiritu Santo
//September, 18, 2024
//Lab 6
//This program takes test scores from the user
import java.util.Scanner;

public class FileTracker {

    public static void main(String[] args) {
        //sets up the variables
        int neededBlocks = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many 512-byte blocks are available on the "
                + "storage device?");
        int storageBlocks = keyboard.nextInt();
        System.out.println("How big is the file in bytes?");
        int fileBytes = keyboard.nextInt();

        while (fileBytes >= 0)
        {
            //Calculates file compression
            fileBytes = fileBytes / 10 * 8;

            //Calculates block use for every 512 bytes
            if (fileBytes >= 512)
            {
                neededBlocks = fileBytes / 512;
            }
            else if (fileBytes < 512)
            {
                neededBlocks = 1;
            }

            //Calculates remaining storage in blocks
            storageBlocks = storageBlocks - neededBlocks;

            //If the amount of storage needed is more than available
            if (storageBlocks < 0)
            {
                System.out.println ("Not enough storage!");
                System.exit (0);
            }

            //Prints the result
            System.out.println("The file will be compressed to "
                    + fileBytes + " bytes. That will take "
                    + neededBlocks + " blocks. You have "
                    + storageBlocks + " available.");

            //If there are no more storage blocks left
            if (storageBlocks == 0)
            {
                System.out.println ("No storage blocks are left!");
                System.exit (0);
            }

            //Repeats
            System.out.println("How big is the file in bytes?");
            fileBytes = keyboard.nextInt();
        }
    }
}