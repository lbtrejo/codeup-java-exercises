package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        Quadrilateral myShapeSquare;

        myShape = new Rectangle(5.0, 10.0);
        myShapeSquare = new Square(5.0);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        System.out.println("myShapeSquare.getArea() = " + myShapeSquare.getArea());
        System.out.println("myShapeSquare.getPerimeter() = " + myShapeSquare.getPerimeter());

//        myShape.getLength();   // This does not work because myShape is a Measurable variable, meaning it can only access the Measureable methods
        System.out.println("myShapeSquare.getLength() = " + myShapeSquare.getLength());  // Does work because myShapeSquare is a Quad, which has implemented those methods
    }
}
