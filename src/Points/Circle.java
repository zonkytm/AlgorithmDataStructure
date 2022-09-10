package Points;

public class Circle {

    private Point point;
    private double radius;
    {
       point=new Point();
       radius=0;
    }
    public Circle(){}
    public Circle(double x,double y, double radius){
        point.setX(x);
        point.setY(y);
        this.radius=radius;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    public void setX(double x){
        point.setX(x);
    }
    public void setY(double y){
        point.setY(y);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                 point.toString() +
                ", radius=" + radius +
                '}';
    }
}
