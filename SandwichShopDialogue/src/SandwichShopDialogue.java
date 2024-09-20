//Aristotle Espiritu Santo
//September, 3, 2024
//Lab 4
//This program will ask questions about sandwiches using dialogue boxes
import javax.swing.JOptionPane;

public class SandwichShopDialogue
{

    public static void main(String[] args)
    {
        //Asks if the user would like to order a ham sandwich
        int hamSandwich = JOptionPane.showConfirmDialog (null,
                        "Hi, welcome to the sandwich shop! We are "
                        + "having a sale on ham sandwiches! Would you like to "
                        + "order one?",
                        "Shopkeeper", JOptionPane.YES_NO_OPTION);

                        //If the user says yes
                        if (hamSandwich ==JOptionPane.YES_OPTION)
                        {
                            //Confirms the order of ham sandwich and ends
                            System.out.println("One ham sandwich coming up!");

                            System.exit (0);
                        }

                        //If the user says no
                        if (hamSandwich ==JOptionPane.NO_OPTION)
                        {
                            //Asks what sandwich the user actually wants
                            String otherSandwich = JOptionPane.showInputDialog
                                            ("What sandwich would you "
                                            + "like to order instead?");

                            System.out.println("One " + otherSandwich +
                                                " sandwich coming up!");
                            System.exit (0);
                        }
    }
}