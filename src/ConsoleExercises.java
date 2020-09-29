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
        scan.useDelimiter("\n");

        // Prompt the console for input and store it as a variable
//        System.out.println("Enter an integer of your choosing: ");
//        int userInput = scan.nextInt();
//
//        // Output the varible back to the user
//        System.out.printf("You entered: %d%n", userInput);

        // How to handle error output if there is a problem with the entered data?  (research TODO)

        // Scanner 2:
        // Prompt the user:
//        System.out.println("Enter 3 words that describe you: ");
//
//        String firstWord = scan.next();
//        String secondWord = scan.next();
//        String thirdWord = scan.next();
//
//        System.out.println("Here is your description: ");
//        System.out.printf("First descriptor: %s%n", firstWord);
//        System.out.printf("Second descriptor: %s%n", secondWord);
//        System.out.printf("Third descriptor: %s%n", thirdWord);

        // Entering fewer than 3 words doesn't allow the program to complete, it hangs waiting for the last input
        // Entering more than 3 words only returns the first 3 words in the sequence, anything additional is dropped

        // Scanner #3:

//        System.out.println("Enter a sentence: ");
//        //String userSentence = scan.next();  // Only returns the first word of the sentence
//        String userSentence = scan.nextLine(); // Returns the full sentence as the string variable
//        System.out.printf("Here is your sentence: \"%s\"%n", userSentence);

        // Classroom dimensions:
        // #1:
        System.out.println("Please enter the dimensions of the room.");
//        System.out.println("Length:");
        float inputLength = scan.nextFloat();
//        System.out.println("Width: ");
        float inputWidth = scan.nextFloat();
//        System.out.println("Height: ");
        float inputHeight = scan.nextFloat();
        // Assuming integer inputs from string
//        int userLength = Integer.parseInt(inputLength);
//        int userWidth = Integer.parseInt(inputWidth);
        // Assuming float inputs
//        float userLength = Float.parseFloat(inputLength);
//        float userWidth = Float.parseFloat(inputWidth);
//        float userHeight = Float.parseFloat(inputHeight);

        System.out.printf("Entered length: %.2f%n", inputLength);
        System.out.printf("Entered width: %.2f%n", inputWidth);
        System.out.printf("Entered height: %.2f%n", inputHeight);

        float area = inputLength * inputWidth;
        float perimeter = 2 * (inputLength + inputWidth);
        float volume = area * inputHeight;

        System.out.printf("The area of the room: %.2f%n", area);
        System.out.printf("The perimeter of the room: %.2f%n", perimeter);
        System.out.printf("The volume of the room: %.2f%n", volume);

    }
}
