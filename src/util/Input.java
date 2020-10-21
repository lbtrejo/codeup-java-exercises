package util;

import java.util.Scanner;

public class Input {
    private Scanner inputScan;

    public Input(){
       this.inputScan = new Scanner(System.in);
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.inputScan.nextLine();
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = this.inputScan.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(String prompt){
        try {
            String userInput = this.getString(prompt);
            return Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid integer value");
            return getInt(prompt);
        }

    }

    public int getInt(int min, int max, String prompt){
        String userInput = this.getString(prompt);
        int userInt;
        try {
            userInt = Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid integer.");
            return getInt(min, max, prompt);
        }
        if (min <= userInt && userInt <= max) {
            return userInt;
        } else {
            System.err.printf("%d is not between %d and %d.%n", userInt, min, max);
            return getInt(min, max, prompt);
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return this.inputScan.nextDouble();
    }

    public double getDouble(double min, double max, String prompt){
        System.out.printf(prompt);
        double userInput = this.inputScan.nextDouble();
        if (min <= userInput && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Please enter a valid number in the range: ");
            return getDouble(min, max, prompt);
        }
    }
}
