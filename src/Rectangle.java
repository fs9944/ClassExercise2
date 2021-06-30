public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double length, double width,String color, boolean filled){
        super();
        this.length=length;
        this.width=width;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
    @Override
    public String toString() {
        return super.toString()+"\nA Rectangle with width= "+width+" and length="+length;
    }
}
