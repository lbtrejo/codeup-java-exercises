import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Number output formatting exercise
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

        // Scanner class exercises
        // Scanner 1:
        // First import the scanner
        Scanner scan = new Scanner(System.in);

        // Prompt the console for input and store it as a variable
        System.out.println("Enter an integer of your choosing: ");
        int userInput = scan.nextInt();

        // Output the varible back to the user
        System.out.printf("You entered: %d%n", userInput);

        // How to handle error output if there is a problem with the entered data?  (research TODO)

        // Scanner 2:
        // Prompt the user:
        System.out.println("Enter 3 words that describe you: ");

        String firstWord = scan.next();
        String secondWord = scan.next();
        String thirdWord = scan.next();

        System.out.println("Here is your description: ");
        System.out.printf("First descriptor: %s%n", firstWord);
        System.out.printf("Second descriptor: %s%n", secondWord);
        System.out.printf("Third descriptor: %s%n", thirdWord);

        // Entering fewer than 3 words doesn't allow the program to complete, it hangs waiting for the last input
        // Entering more than 3 words only returns the first 3 words in the sequence, anything additional is dropped
    }
}
