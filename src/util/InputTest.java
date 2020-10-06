package util;

public class InputTest {
    public static void main(String[] args) {

        String userInput;
        Input testing = new Input();
        userInput = testing.getString();
        System.out.println("User Input: " + userInput);

        String stringPromptInput = testing.getString("What is your input?:");
        System.out.println("stringPromptInput = " + stringPromptInput);

        boolean boolTest = testing.yesNo();
        System.out.println("yesNo result: " + boolTest);

        int intTest = testing.getInt();
        System.out.println("getInt result: " + intTest);

        int intTestParams = testing.getInt(1, 10);
        System.out.println("getIntParams result: " + intTestParams);

        double dblTest = testing.getDouble();
        System.out.println("getDouble result: " + dblTest);

        double dblTestParams = testing.getDouble(1.0, 10.0);
        System.out.println("getDoubleParams result: " + dblTestParams);
    }
}
