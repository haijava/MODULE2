package codegym.hai.ex1;

public class Circle {
    private double radius;
    private String color ;
    final  private static double PI =3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
public double getArea(){
        return  Math.pow(this.getRadius(),2)*PI;
}

    @Override
    public String toString() {
        return " A Circle with radius " + radius + " with color= " + color+"";
    }
}
