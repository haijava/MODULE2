package codegym.module2.Resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        double r = (this.height *this.width);
        return  r;
    }

    @Override
    public void  resize(double percent) {
      double r=  this.getArea()*percent + getArea();
        System.out.println("Area of Rectangle is " +r);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
}
