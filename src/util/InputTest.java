package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();

//        int userInt = input.getInt("Enter an integer: ");
//        System.out.println("userInt = " + userInt);

        int userIntTwo = input.getInt(1, 10, "Enter an integer between 1 and 10:");
        System.out.println("userIntTwo = " + userIntTwo);

    }
}
