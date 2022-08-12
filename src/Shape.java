import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape implements Print{
    private Color color;
    private String name;
    protected double area;
    public Map<String,Point> points;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.printf("\nShape - Color: %s;\n", color);
    }
    public Shape(Color color){
        this.color = color;
        this.points = new HashMap<>();
    }

    public Shape() {
        this(Color.black);
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

}
