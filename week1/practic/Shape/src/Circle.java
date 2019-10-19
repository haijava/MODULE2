public class Circle extends Shape{
    private double radius =1.0 ;

    public Circle() {

    }
    public  Circle(double radius){
        this.radius =radius;
    }
    public Circle(double radius,boolean filled,String colo){
        super(colo,filled);
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return  this.radius * Math.PI*2;
    }

    @Override
    public String toString() {
        return "A Circle with radius is " + getRadius()+ " is Subclass of "+super.toString();
    }
}
