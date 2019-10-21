package codegym.module2.Resizeable;

public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }

    @Override
    public void resize(double percent) {
       double m= getArea()*percent +getArea();
        System.out.println("Area of Square is "+m);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
