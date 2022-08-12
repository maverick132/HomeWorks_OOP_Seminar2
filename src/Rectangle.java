import java.awt.*;

public class Rectangle extends Shape{
    private int sideA, sideB;
    private static int count;
    public Rectangle(Color color, Point leftBot, Point leftTop, Point rightTop, Point rightBot){
        this.points.put("LeftBottom",leftBot);
        this.points.put("RightBottom",rightBot);
        this.points.put("LeftTop",leftTop);
        this.points.put("RightTop",rightTop);
        this.setColor(color);
        this.sideA = (int)leftBot.distance(leftTop);
        this.sideB = (int)leftBot.distance(rightBot);
        this.area = this.sideA*this.sideB;
        setName();
    }
    private void setName(){
        this.setName("Rectangle #" + ++count);
    }
    public Rectangle(Color color){
        this(color, new Point(), new Point(0,1), new Point(1,1), new Point(1,0));
    }
    public Rectangle(){
        this(Color.BLACK);
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void printInfo(){
        System.out.printf("\n%s\nColor: %s;\nSide A: %d;\nSide B: %d;\nRectangle area: %.3f;\n ",
                         this.getName(), this.getColor(), this.sideA,this.sideB, this.area);
    }



}
