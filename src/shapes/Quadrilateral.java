package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double len, double wid){
        this.length = len;
        this.width = wid;
    }

//    @Override
//    public double getPerimeter() {
//        return (2 * (this.length + this.width));
//    }
//
//    @Override
//    public double getArea() {
//        return (this.length * this.width);
//    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

     public abstract void setLength(Double length);
     public abstract void setWidth(Double width);
}
