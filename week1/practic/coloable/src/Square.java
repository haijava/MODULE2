public class Square extends Shape implements Colorable{

    private double side =1;
    private String color ="green";
    private boolean filled =true;

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getPerimeter(){
        double p = this.side *4;
        return  p;
    }
    public double getArea(){
        double a = Math.pow(this.side,2);
        return a;
    }
    @Override
    public void howToColor() {
        System.out.println("color all four side");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled + "Area" +getArea()+
                '}';
    }
}
