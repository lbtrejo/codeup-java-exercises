package util;

public class InputTest {
    public static void main(String[] args) {

        Input input = new Input();

        double userDbl = input.getDouble(0.0, 100.00, "Enter a decimal:");
        System.out.println("userDbl = " + userDbl);

    }
}
