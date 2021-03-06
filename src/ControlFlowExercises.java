import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1.  Loop Basics
            // a. While loop
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }

            // b. Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while(x <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.
//        int x = 100;
//        do {
//            System.out.println(x);
//            x -= 5;
//        } while(x >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long x = 2;
        // originally had this as an int type, caused a fun looping bug because 65536 squared was above the limit for int values

//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x < 1000000);

        // C. Refactor A and B to use a for loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i + " ");
//        }
//
//        for (long x = 2; x < 1000000; x *= x) {
//            System.out.println(x);
//        }
        // 2. Fizzbuzz
//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        // 3. Table of powers
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("What number would you like to go up to? ");
//        int userInput = Integer.parseInt(scanner.next());
//
//        System.out.println("Number chosen: " + userInput);
//        System.out.println("Here is your table!");
//        System.out.println("");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int x = 1; x <= userInput; x++){
//            int squared = (x * x);
//            int cubed = (x * x * x);
//            System.out.println(x + "      | " + squared + "      | " + cubed);
//        }

        // 4.  Convert given number grades into letter grades

        String keepGoing;
        do {
            System.out.println("Enter a numerical grade to be converted: ");
            int userGrade = Integer.parseInt(scanner.next());
            System.out.println("Numerical grade: " + userGrade);
            if (userGrade >= 99) {
                System.out.println("Letter grade: A+");
            } else if (userGrade > 91) {
                System.out.println("Letter grade: A");
            }else if (userGrade > 87) {
                System.out.println("Letter grade: A-");
            } else if (userGrade > 79) {
                System.out.println("Letter grade: B");
            } else if (userGrade > 66) {
                System.out.println("Letter grade: C");
            } else if (userGrade > 59) {
                System.out.println("Letter grade: D");
            } else {
                System.out.println("Letter grade: F");
            }
            System.out.println("Would you like to continue?  [y/N]");
            keepGoing = scanner.next();
        }while(keepGoing.equals("y"));
    }
}
