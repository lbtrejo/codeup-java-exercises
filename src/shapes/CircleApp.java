package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean anotherCircle;

        do {
            Input userInput = new Input();
            double currentRadius = userInput.getDouble("Please enter a radius for your circle: ");

            Circle currentCircle = new Circle(currentRadius);
            System.out.printf("Your circle radius: %.3f", currentCircle.getRadius());
            System.out.printf("Your circle circumference: %.3f", currentCircle.getCircumference());
            System.out.printf("Your circle area: %.3f%n", currentCircle.getArea());

            anotherCircle = userInput.yesNo("Another circle?");
        } while (anotherCircle);

        Circle.getCirclesCreated();
    }
}

