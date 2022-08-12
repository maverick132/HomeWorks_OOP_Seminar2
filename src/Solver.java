import java.util.ArrayList;

public class Solver implements Print{
    protected ArrayList<Shape> shapes;
    private double max = 0;
    private String figureMax ="";
    public Solver(ArrayList<Shape> shapes){
        this.shapes = shapes;
    }
    public void MaxArea(){
        for (Shape item: this.shapes) {
            if (item.getArea() > max) {
                max = item.getArea();
                figureMax = item.getName();
            }
        }
        System.out.printf("\nFigure with max area: %s\nArea this figure: %.3f", figureMax, max);

    }
    @Override
    public void printInfo(){
        for (Shape item:this.shapes) {
            item.printInfo();
        }
    }

    public double getMax() {
        return max;
    }

    public String getFigureMax() {
        return figureMax;
    }


}

