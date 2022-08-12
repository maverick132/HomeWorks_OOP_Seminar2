import java.awt.*;

public class Circle extends Shape {
    private double radius;
    private static int count;
    public Circle(Color color, Point point){
        this.radius = point.distance(new Point());
        this.points.put("Centre",new Point());
        this.points.put("Circle",point);
        this.setColor(color);
        this.area = Math.PI * Math.pow(radius, 2);
        setName();
    }

    private void setName(){
        this.setName("Circle #" + ++count);
    }

    public Circle(Color color){
        this(color, new Point(1));
    }

    public Circle(Point point){
        this(Color.BLACK, point);
    }
    public  Circle(){
        this(new Point(1));
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public void printInfo(){
        System.out.printf("\n%s\nColor: %s;\nRadius: %.3f;\nSquare area: %.3f;\n ",
                            this.getName(), this.getColor(), this.radius, this.area);
    }


}
