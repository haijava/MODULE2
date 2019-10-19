package codegym.hai.ex1;

public class Cylinder extends Circle {
    private double height;
    final private static double PI =3.14;
    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height =height;
    }

    public double getVolume(){
        return this.height*getArea();
    }

    @Override
    public String toString() {
        return " A Cylinder with height = " + height + " which is a Subclass of: "+ super.toString();
    }
}
