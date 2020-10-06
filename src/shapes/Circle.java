package shapes;

public class Circle {
    private double radius;
    private static int totalCirclesCreated = 0;

    public Circle(double radius){
        this.radius = radius;
        Circle.totalCirclesCreated++;
    }

    public double getCircumference(){
        System.out.println(2 * Math.PI * this.radius);
        return (2 * Math.PI * this.radius);
    }

    public double getArea(){
        System.out.println(Math.PI * Math.pow(this.radius, 2));
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getRadius(){
        return this.radius;
    }

    public static void getCirclesCreated(){
        System.out.printf("%d circles have been created.", totalCirclesCreated);
    }
}
