import java.util.Scanner;

public class RectangleClass {
    double width,height;
    public RectangleClass(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;

    }
    public String display(){

        return " Information of Rectangle { Width " + width+ ", height "+ height+ "}";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input width values");
        double width = sc.nextDouble();
        while(width<0){
            System.out.println("Please input width values again");
             width = sc.nextDouble();
        }
        System.out.println("Please input height values");
        double height = sc.nextDouble();
        while(height<0){
            System.out.println("Please input height values again");
            height = sc.nextDouble();
        }
        RectangleClass rectan1 = new RectangleClass(width,height);
        System.out.println(rectan1.display());
        System.out.println("Area of Rectangle is "+rectan1.getArea());
        System.out.println("Perimeter of Rectangle is "+rectan1.getPerimeter());
    }
}
