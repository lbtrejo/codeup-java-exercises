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
        System.out.println(prompt);
        return this.inputScan.nextInt();
    }

    public int getInt(int min, int max, String prompt){
        System.out.printf(prompt);
        int userInput = this.inputScan.nextInt();
        if (min <= userInput && userInput <= max) {
//            System.out.printf("Your chosen integer: %d%n", userInput);
            return userInput;
        } else {
            System.out.println("Please enter a valid integer");
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
//            System.out.printf("Your chosen number: %f%n", userInput);
            return userInput;
        } else {
            System.out.println("Please enter a valid number in the range: ");
            return getDouble(min, max, prompt);
        }
    }
}
