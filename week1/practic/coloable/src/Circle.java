public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        double p= 2*Math.PI*this.radius;
        return p;
    }
    public double getArea(){
        double a = this.radius*radius*Math.PI;
        return a;
    }

    @Override
    public String toString() {
        return "A Circle is a Subclass of Shape with radius" +getRadius()+ " with Color " +getColor()+" Area " +getArea()+"\n";
    }
}
