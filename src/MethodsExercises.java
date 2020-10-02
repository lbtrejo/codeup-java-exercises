import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        add(12, 3);
//        subtract(12, 3);
//        multiply(12, 3);
//        divide(12, 3);
//        modulus(12, 5);
//        longMultiply(-2,5);
        System.out.println(recursiveMultiply(6, 5));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
    }

    // 1.  Basic arithmetic
    public static int add(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        System.out.println(num1 - num2);
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        System.out.println(num1 * num2);
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        System.out.println(num1 / num2);
        return num1 / num2;
    }
    public static int modulus(int num1, int num2) {
        System.out.println(num1 % num2);
        return num1 % num2;
    }
    public static int longMultiply(int num1, int num2) {
        int result = 0;
        for (int x = 1; x <= num2; x++) {
            result  += num1;
        }
        System.out.println(result);
        return result;
    }
    public static int recursiveMultiply(int num1, int num2) {
        int result;
        if (num2 == 1){
            result = num1;
        } else {
            result = num1 + recursiveMultiply(num1, num2 - 1);
        }
        return result;
    }

    public static int getInteger(int min, int max) {
        // scan for user input
        Scanner scanner = new Scanner(System.in);

        int currentInput = scanner.nextInt();
        if (min <= currentInput && currentInput <= max) {
            return currentInput;
        } else {
            System.out.println("Please enter a valid integer");
            return getInteger(min, max);
        }
        // verify the input is inside the valid range
        // return the number if valid
        // rerun the method if invalid
    }
}
