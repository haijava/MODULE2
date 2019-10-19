public class Square extends Rectangle{

    public Square() {
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);

    }
    public double getSide(){
        return getWidth();
    }
    public  void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public double getArea(double side) {
        return this.getSide()*this.getSide();
    }
    public double getPerimeter(double side){
        return (this.getSide()+this.getSide())*2;
    }

    @Override
    public String toString() {
        return " A square with side = "+getSide()+"which is a Subclass of "+super.toString();
    }
}
