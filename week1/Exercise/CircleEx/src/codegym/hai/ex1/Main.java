package codegym.hai.ex1;

public class Main {
    public static void main(String[] args) {
        //Circle
        Circle cir1 = new Circle(4,"brown");
        double irr = cir1.getArea();
        System.out.println("Area of Circlr is " + Math.round(irr));
        System.out.println("information about Circle is " + cir1.toString());


        Cylinder cy1 =new Cylinder(2,"red",5);
        cy1.setColor("yellow");


        System.out.println(" information about Cylinder \n "+cy1.toString());
        double cee = cy1.getArea();
        double vol = cy1.getVolume();
        System.out.println(" Area of Cylinder is " +Math.round(cee));
        System.out.println("volume " + Math.round(vol));

    }
}
