package codegym.homebt.hai3;

import java.util.Scanner;

public class Shape {
    public int width, height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public void draw(int width, int height) {
        this.height = height;
        this.width = width;

    }
    public static void main(String[] args) {
        Rectangle rsc = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("input Width");
        int width = sc.nextInt();

        System.out.println("input Height");
        int height = sc.nextInt();

        Shape sap = new Shape(width, height);
        rsc.draw(sap);

        double areas = rsc.getAreas(sap);
        System.out.println("Area is"+areas);
        Square hv = new Square();
        hv.draw(sap);

        int area = hv.getArea(sap);
        System.out.println("Area is" +area);

        Circle ht =new Circle();
        double getArea = ht.getArea(sap);
        System.out.println("Area is "+getArea);

    }
}
