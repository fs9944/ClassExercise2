public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color, boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    @Override
    public String toString() {
        return super.toString()+"\nA Circle with radius= " + radius;
    }
}
