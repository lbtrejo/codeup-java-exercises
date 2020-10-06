package util;

import java.util.Scanner;

public class Input {
    private Scanner inputScan;

    public Input(){
       this.inputScan = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string: ");
        return this.inputScan.next();
    }

    public boolean yesNo(){
        System.out.println("Yes or no?: ");
        String userInput = this.inputScan.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(){
        System.out.println("Enter an integer: ");
        return this.inputScan.nextInt();
    }

    public int getInt(int min, int max){
        System.out.printf("Enter an integer between %d and %d: %n", min, max);
        int userInput = this.inputScan.nextInt();
        if (min <= userInput && userInput <= max) {
            System.out.printf("Your chosen integer: %d%n", userInput);
            return userInput;
        } else {
            System.out.println("Please enter a valid integer");
            return getInt(min, max);
        }

    }

    public double getDouble(){
        System.out.println("Enter an number: ");
        return this.inputScan.nextDouble();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %f and %f: %n", min, max);
        double userInput = this.inputScan.nextDouble();
        if (min <= userInput && userInput <= max) {
            System.out.printf("Your chosen number: %f%n", userInput);
            return userInput;
        } else {
            System.out.println("Please enter a valid number in the range: ");
            return getDouble(min, max);
        }

    }
}
