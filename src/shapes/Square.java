package shapes;

public class Square extends Quadrilateral {

    public Square(double sides){
        super(sides, sides);
    }

    public void setLength(Double sides){
        this.length = sides;
        this.width = sides;
    }

    public void setWidth(Double sides){
        this.width = sides;
        this.length = sides;
    }

    @Override
    public double getArea() {
        return (Math.pow(this.length, 2));
    }

    @Override
    public double getPerimeter() {
        return (4 * this.length);
    }
}
