import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        String responseQuestion = "Sure";
        String responseYell = "Whoa, chill out!";
        String responseEmpty = "Fine.  Be that way!";
        String responseDefault = "Whatever.";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ABA: Ask Bob Anything!");

        do {
            System.out.println("What is your question?: ");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Bob: " + responseQuestion);
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: " + responseYell);
            } else if (userInput.length() == 0) {
                System.out.println("Bob: " + responseEmpty);
            } else {
                System.out.println("Bob: " + responseDefault);
            }
            System.out.println("Would you like to continue? [y/N]");
            String userContinue = scanner.next();

            if (!userContinue.equalsIgnoreCase("y")) {
                System.out.println("Thanks for chatting!");
                break;
            }
            // Below required to ensure the previous scanner.next/nextLine commands work appropriately on another loop
            scanner.nextLine();
        }while(true);
    }
}
