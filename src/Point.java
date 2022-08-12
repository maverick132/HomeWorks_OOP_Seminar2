public class Point {
    private int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(){
        this(0);
    }
    public Point(int coordinate){
        this(coordinate, coordinate);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }
    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

}
