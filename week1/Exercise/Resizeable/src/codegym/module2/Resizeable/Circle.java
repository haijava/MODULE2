package codegym.module2.Resizeable;

import java.util.Random;
import java.util.Scanner;

public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * radius *Math.PI;
    }

    @Override
    public void resize(double percent) {
        double n = getArea()*percent+ getArea();
        System.out.println(" Area of Circle is "+n);
    }

    @Override
    public String toString() {
        return "A Circle is a Subclass Resizeble  with radius" + radius + "";
    }
}
