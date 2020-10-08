package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int rLenght, int rWidth){
        this.length = rLenght;
        this.width = rWidth;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return 2 * (this.length + this.width);
    }
}
