package Circle;

import java.util.Objects;

public class Circle {
    private double S;
    private double Length;
    private double radius;

    public Circle(){
        setRadius(0);
    }
    public Circle(double radius) {

        setRadius(radius);
    }

    public double getS() {
        return S;
    }

    public double getLength() {
        return Length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            radius=Math.abs(radius);
        }
        this.radius = radius;
        S=Math.PI*Math.pow(this.radius,2);
        Length=2*Math.PI*this.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
