import java.util.Scanner;

public class HighLow {
    /*
    Game picks a random number between 1 and 100. - DONE
    Prompts user to guess the number.
    All user inputs are validated.
    If user's guess is less than the number, it outputs "HIGHER".
    If user's guess is more than the number, it outputs "LOWER".
    If a user guesses the number, the game should declare "GOOD GUESS!"
    Use the random method of the java.lang.Math class to generate a random number.
    BONUS: Keep track of how many guesses a user makes.
    BONUS: Set an upper limit on the number of guesses.
     */
    // generate the number
    public static int generateRandom(){
        int random = (int)(Math.random()*((100-1)+1))+1;
        System.out.println("random = " + random);
        return random;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guessNumber = generateRandom();
        int timesGuessed = 1;
        int guessLimit = 5;
        System.out.println("Welcome to the HighLow guessing game!");
        System.out.println("Please guess a number between 1 and 100");
        int playerGuess = scanner.nextInt();
        while (true){
            if (timesGuessed > guessLimit){
                System.out.println("You ran out of guesses. Better luck next time!");
                break;
            }
            if (playerGuess > guessNumber){
                System.out.println("LOWER");
                timesGuessed++;
                playerGuess = scanner.nextInt();
            } else if (playerGuess < guessNumber){
                System.out.println("HIGHER");
                timesGuessed++;
                playerGuess = scanner.nextInt();
            } else {
                System.out.println("GOOD GUESS!");
                System.out.printf("You made %d guesses.%n", timesGuessed);
                break;
            }
        }
        System.out.println("Thanks for playing!");
    }
}
