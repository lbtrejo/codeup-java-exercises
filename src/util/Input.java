package util;

import java.util.Scanner;

public class Input {
    private Scanner inputScan;

    public Input(){
       this.inputScan = new Scanner(System.in);
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.inputScan.next();
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
        try {
            String userInput = this.getString(prompt);
            return Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid decimal value");
            return getDouble(prompt);
        }

    }

    public double getDouble(double min, double max, String prompt) {
        String userInput = this.getString(prompt);
        double userDbl;
        try {
            userDbl = Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid decimal number.");
            return getDouble(min, max, prompt);
        }
        if (min <= userDbl && userDbl <= max) {
            return userDbl;
        } else {
            System.err.printf("%f is not between %f and %f.%n", userDbl, min, max);
            return getDouble(min, max, prompt);
        }
    }

    public int getBinary(String prompt){
        try {
            String userInput = this.getString(prompt);
            return Integer.valueOf(userInput, 2);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid binary value");
            return getInt(prompt);
        }
    }

    public int getHex(String prompt){
        try {
            String userInput = this.getString(prompt);
            return Integer.valueOf(userInput, 16);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid hexadecimal value");
            return getInt(prompt);
        }
    }
}
