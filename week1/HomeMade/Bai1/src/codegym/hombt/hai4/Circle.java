package codegym.hombt.hai4;

public class Circle {
    private int radius;
    final double PI =3.14;
    public  Circle(int radius){
        this.radius = radius;
    }
    public double Area(){
        return this.radius*this.radius*PI;
    }
    public  void Draw(){
        System.out.println("Draw circle");
    }
}
