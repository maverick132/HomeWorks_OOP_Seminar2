import java.util.ArrayList;

public class Find {
    public static double MaxArea(ArrayList<Shape> shapes){
        double max = 0;
        String figureMax ="";
        for (Shape item: shapes) {
            if (item.getArea() > max) {
                max = item.getArea();
                figureMax = item.name;
            }
        }
        System.out.println(max);
        System.out.println(figureMax);
        return 0;
    }
}

