package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(Double len, Double wid){
        super(len, wid);
    }

    public void setLength(Double len) {
        this.length = len;
    }

    public void setWidth(Double wid) {
        this.width = wid;
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    @Override
    public double getPerimeter() {
        return (2 * (this.length + this.width));
    }
}
