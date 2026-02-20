import java.util.Random; // The Random class in Java only generates numeric types : int ,long ,float ,double ,boolean.
import java.util.Scanner;

// Class to handle the number matching logic
class Number_Match{

    Random rand = new Random(); // Creates a new Random object named 'rand' which can generate pseudo-random numbers.
    int randNum; // Stores the randomly generated number
    int score = 10;  // Initial score of the player
    boolean finalVerdict = false; // Flag to determine if game ends (true if win or invalid input)

    // Constructor to initialize random number
    Number_Match()
    {
        randNum = rand.nextInt(1,101); // rand.nextInt(1,101) generates a random integer between 1 and 100 (inclusive)
    }

    // Method to verify the guessed number
    boolean matchVerifier(int guess)
    {

            if(guess>100 || guess<1)
            {
                // ⚠️ Warning emoji + error message
                System.out.println("⚠\uFE0FInvalid input! Please Guess the number from 1 to 100. \n"); // Simply copy and paste the emoji, and its corresponding Unicode will be generated automatically.
                score = 0 ;
                return finalVerdict = true ; // End the game
            }
            else if (guess == randNum) {

                System.out.println("You won!\uD83C\uDF8A\uD83C\uDF8A \n"); // 🎊 Celebration emoji + win message
                finalVerdict = true;
                return finalVerdict;

            }
            else if(guess>randNum)
            {
                System.out.printf("MisMatched!\uD83D\uDE13 \n"); // 😓 MisMatched emoji + message
                System.out.printf("\uD83D\uDCA1Hint : Hidden Number is smaller than %d \n\n",guess); // 💡 Hint emoji + hint
                score-- ;
                return finalVerdict; // Continue the game

            }
            else
            {
                System.out.printf("MisMatched!\uD83D\uDE13 \n");
                System.out.printf("\uD83D\uDCA1Hint : Hidden Number is greater than %d \n\n",guess);
                score-- ;
                return finalVerdict;
            }


    }



}


public class Guessing_Game {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Number_Match nm = new Number_Match();

        int max = 10;
        boolean finalVerdict = false;
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t✨✨ Guess the Number ✨✨ \n"); // ✨ emoji + Title of the game in console
        System.out.println("\n\uD83D\uDCDD Note : Guess the number from 1 to 100 "); // 📝 Note and 📌 Reminder for the player
        System.out.println("\uD83D\uDCCC Reminder: Use hints wisely! \n");

        for(int i=0; i<max ; i++) // Loop for taking user guesses (max 5 attempts)
        {
            System.out.println("Guess the number\uD83D\uDD75\uFE0F :  ");
            int guess = in.nextInt();
            finalVerdict = nm.matchVerifier(guess);
            if(finalVerdict) // If game ends (win or invalid input)
            {
                break;
            }

        }
        if(!finalVerdict) // If player did not guess correctly within attempts, reveal the hidden number
        {
            System.out.println("The Hidden Number is \uD83D\uDC40 : " + nm.randNum);
        }

        int score  = nm.score;
        System.out.println("Your Score\uD83C\uDFAF : " + score); // Display final score.


    }
}

