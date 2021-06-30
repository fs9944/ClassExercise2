import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Shape> c = new ArrayList<>();
        ArrayList<Shape> r = new ArrayList<>();
        ArrayList<Shape> s = new ArrayList<>();

        c.add(new Circle());
        c.add(new Circle(2.0));
        c.add(new Circle(3.0, "green", true));

        r.add(new Rectangle());
        r.add(new Rectangle(4.0, 5.0));
        r.add(new Rectangle(6.0, 7.0, "blue", false));

        s.add(new Square());
        s.add(new Square(8.0));
        s.add(new Square(9.0, "yellow", true));

        for (int i = 0; i < c.size(); i++) {
            if ((c.get(i)) instanceof Circle) {
                System.out.println("c" + i + "\n" + ((Circle) (c.get(i))).toString());
                System.out.println("Area=" + (((Circle) (c.get(i))).getArea() + "\nPerimeter=" +
                        (((Circle) (c.get(i))).getPerimeter())));
                System.out.println("=======================");
            }
        }
        for (int i = 0; i < c.size(); i++) {
            if ((r.get(i)) instanceof Rectangle) {
                System.out.println("r" + i + "\n" + ((Rectangle) (r.get(i))).toString());
                System.out.println("Area=" + ((Rectangle) (r.get(i))).getArea() + "\nPerimeter=" +
                        ((Rectangle) (r.get(i))).getPerimeter());
                System.out.println("=======================");
            }
        }
        for (int i = 0; i < c.size(); i++) {
            if ((s.get(i)) instanceof Square) {
                System.out.println("s" + i + "\n" + ((Square) (s.get(i))).toString());
                System.out.println("Area=" + ((Square) (s.get(i))).getArea() + "\nPerimeter=" +
                        ((Square) (s.get(i))).getPerimeter());
                System.out.println("=======================");
            }
        }
    }
}


