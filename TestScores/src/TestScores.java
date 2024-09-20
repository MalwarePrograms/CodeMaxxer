//Aristotle Espiritu Santo
//September, 18, 2024
//Lab 6
//This program takes test scores from the user
import java.util.Scanner;

public class TestScores
{

    public static void main(String[] args)
    {
        //sets up the variables
        int testScores = 0;
        int scoreHighest;
        int scoreLowest;
        int scoreAverage;
        int scoreTotal = 0;

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter a test score 0 and up.");
        int currentScore = keyboard.nextInt();
        scoreHighest = currentScore;
        scoreLowest = currentScore;
        while (currentScore >= 0)
        {
            //Counts the amount of scores entered
            testScores++;

            //Finds highest score
            if (currentScore >= scoreHighest)
            {
                scoreHighest = currentScore;
            }

            //Finds lowest score
            if (currentScore <= scoreLowest)
            {
                scoreLowest = currentScore;
            }

            //Calculates average
            scoreTotal = scoreTotal + currentScore;
            scoreAverage = scoreTotal / testScores;

            //Repeats
            System.out.println("You entered " + testScores + " scores.");
            System.out.println("The highest score is " + scoreHighest);
            System.out.println("The highest score is " + scoreLowest);
            System.out.println("The average score is " + scoreAverage);

            System.out.println("Enter a test score");
            currentScore = keyboard.nextInt();
        }

        assert (currentScore < 0): "Error. You've entered a score lower "
                                    + "than 0.";
    }
}