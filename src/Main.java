import java.util.Random;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Random rnd = new Random();
        int die1;
        int die2;
        int crapsRoll;
        int pointSum;
        String playAgain;
        String rollDice;
        boolean yesNo;
        boolean winLose;
        Scanner in = new Scanner(System.in);
        do
        {
        System.out.println("\nRoll the Dice to Begin a Game of Craps");
        System.out.print("Enter Any Key to Roll the Dice:");
        rollDice = in.nextLine();
         die1 = rnd.nextInt(6) + 1;
         die2= rnd.nextInt(6) + 1;
         crapsRoll = die1 + die2;
        System.out.println("You Rolled a " + die1 + " and a " + die2 + " for a score of: " + crapsRoll);
        if(crapsRoll == 12 || crapsRoll == 2 || crapsRoll == 3)
        {
            System.out.println("Sorry, You Crapped Out.");
            System.out.println("You lose.");
        }
        else if(crapsRoll == 7 || crapsRoll == 11)
        {
            System.out.println("Congratulations, You Rolled a Natural!");
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("You Rolled a " + crapsRoll + " which is now 'The Point'.");
            System.out.println("You Must Roll 'The Point' Again to Win, but if You Roll a 7, You Lose.");

            System.out.println("\nRoll the Dice Until You Get a 7 or 'The Point'.");
            do
            {
                System.out.print("\nEnter Any Key to Roll the Dice:");
                rollDice = in.nextLine();
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                pointSum = die1 + die2;
                if(pointSum == 7)
                {
                    System.out.println("You Rolled a " + die1 + " and a " + die2 + " which make a " + pointSum + ".");
                    System.out.println("\nSorry, You Lose.");
                    winLose = true;
                }
                else if(pointSum == crapsRoll)
                {
                    System.out.println("You've Rolled a " + die1 + " and a " + die2 + " making a " + pointSum + "Which is 'The Point'.");
                    System.out.println("\nCongratulations, You Win!");
                    winLose = true;
                }
                else
                {
                    System.out.println("You've Rolled a " + die1 + " and a " + die2 + " making a " + pointSum + ".");
                    System.out.println("You Have to Roll Again.");
                    winLose = false;
                }
            }while(!winLose);

        }

            System.out.print("Would You Like to Play Again?(Y/N):");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("Y"))
            {
                yesNo = false;
            }
            else
            {
                yesNo = true;
            }
        }while(!yesNo);
        System.out.println("\nThank You For Playing!");
    }
}
