import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Circle(Color.YELLOW, new Point(10,10)));
        list.add(new Rectangle(Color.GREEN,new Point(), new Point(0,5),
                                             new Point(10,5), new Point(10,0)));
        list.add(new Square(Color.BLUE,new Point(), new Point(0,5),
                                        new Point(5,5), new Point(5,0)));
        list.add(new Triangle(Color.WHITE, new Point(), new Point(0, 3), new Point(4,0)));
        Solver shapes = new Solver(list);
        shapes.printInfo();
        shapes.MaxArea();

    }
}