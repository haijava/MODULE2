public class Rectangle extends Shape {
    private  double width;
    private  double height;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double height,double width) {
        super(color, filled);
        this.height = height;
        this.width =width;
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
    public double getPerimeter(){
        double p = (this.width +this.height) *2;
        return p;
    }
    public double getArea(){
        double a = this.height*this.width;
        return a;
    }

    @Override
    public String toString() {
        return "Rectangle{" + " width =" + width + ", height =" + height +" Area "+getArea()+ "\n"+'}';
    }
}
