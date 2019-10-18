package codegym.hombt.hai4;

public class Shape {
    private Rectangle rectangle1;
    private  Square square1;
    private  Circle circle1;

    public Shape(Rectangle rectangle1, Square square1, Circle circle1) {
        this.rectangle1 = rectangle1;
        this.square1 = square1;
        this.circle1 = circle1;
    }

    public Rectangle getRectangle1() {
        return rectangle1;
    }

    public void setRectangle1(Rectangle rectangle1) {
        this.rectangle1 = rectangle1;
    }

    public Square getSquare1() {
        return square1;
    }

    public void setSquare1(Square square1) {
        this.square1 = square1;
    }

    public Circle getCircle1() {
        return circle1;
    }

    public void setCircle1(Circle circle1) {
        this.circle1 = circle1;
    }

    public void draw(){
        rectangle1.Draw();
        square1.Draw();
        circle1.Draw();
    }
    public double Area(){
        return square1.Area() + circle1.Area() + rectangle1.Area();
    }

    public static void main(String[] args) {
        Shape shap = new Shape(new Rectangle(3,5), new Square(5),new Circle(4));
        shap.draw();
        System.out.println("Total is "+shap.Area());

    }
}
