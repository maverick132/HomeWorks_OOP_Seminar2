import java.awt.*;

public class Triangle extends Shape{
    private double height, base;
    private static int count;
    public Triangle(Color color, Point leftBot, Point top, Point rightBot){
        this.points.put("LeftBottom",leftBot);
        this.points.put("Top",top);
        this.points.put("RightBot",rightBot);
        this.setColor(color);
        this.base = leftBot.distance(rightBot);
        this.height = Math.abs(top.getY() - leftBot.getY());
        this.area = this.base* this.height/2;
        setName();
    }

    private void setName(){
        this.setName("Triangle #" + ++count);
    }

    public Triangle(Color color){
        this(color, new Point(), new Point(1,1), new Point(2,0));
    }
    public Triangle(){
        this(Color.BLACK);
    }

    @Override
    public void printInfo(){
        System.out.printf("\n%s\nColor: %s;\nBase: %.3f;\nHeight: %.3f;\nTriangle area: %.3f;\n ",
                this.getName(), this.getColor(), this.base,this.height, this.area);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
