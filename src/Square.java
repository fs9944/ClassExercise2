public class Square extends Rectangle{
    public Square(){
    }
    public Square(double width){
        super.setWidth(width);
        super.setLength(width);
    }
    public Square(double width,String color, boolean filled){
        super();
        super.setWidth(width);
        super.setLength(width);
        super.setColor(color);
        super.setFilled(filled);
    }

    @Override
    public String toString() {
        return super.toString()+"\nA Square with side="+super.getLength();
    }
}
