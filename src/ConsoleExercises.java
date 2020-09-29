import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // Number output formatting exercise
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

        // Scanner class exercises

        // First import the scanner
        Scanner scan = new Scanner(System.in);

        // Prompt the console for input and store it as a variable
        System.out.println("Enter an integer of your choosing: ");
        int userInput = scan.nextInt();

        // Output the varible back to the user
        System.out.printf("You entered: %d", userInput);

        // How to handle error output if there is a problem with the entered data?  (research TODO)

        
    }
}
