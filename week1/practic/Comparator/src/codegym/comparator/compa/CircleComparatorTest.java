package codegym.comparator.compa;
import javafx.scene.shape.Circle;
import java.util.Comparator;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,3,2);
        System.out.println("Circle pre Sort");
        for (Circle cir:circles){
            System.out.println(cir);
        }
        System.out.println("Circle after Sort");
        Comparator coma = new CircleComparator();
        Arrays.sort(circles,coma);
        for (Circle cir:circles){
            System.out.println(cir);
        }

    }
}
