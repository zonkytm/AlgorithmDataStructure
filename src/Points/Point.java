package Points;

public class Point {
    private double x;
    private double y;
    {
        x=0.0;
        y=0.0;
    }
    public Point(){

    }
    public Point(double x,double y){
        this.x= x;
        this.y= y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
