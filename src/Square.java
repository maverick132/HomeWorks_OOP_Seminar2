import java.awt.*;

public class Square extends Rectangle{
    private static int count;
    public Square(Color color, Point leftBot, Point leftTop, Point rightTop, Point rightBot){
        super(color, leftBot,leftTop, rightTop, rightBot);
        setName();
    }
    public Square(Color color){
        this(color, new Point(), new Point(0,1), new Point(1,1), new Point(1,0));
    }
    public Square(){
        this(Color.BLACK);
    }

    private void setName(){
        this.setName("Square #" + ++count);
    }
    @Override
    public void printInfo(){
        System.out.printf("\n%s\nColor: %s;\nSide: %d;\nSquare area: %.3f;\n ",
                             this.getName(), this.getColor(), this.getSideA(), this.area);
    }
}
