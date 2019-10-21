package codegym.module2.Resizeable;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Resizeable[]array =new Resizeable[3];

        array[0] = new Circle(2);
        array[1] = new Rectangle(2, 5);
        array[2] = new Square(4);

        Scanner sc =new Scanner(System.in);
        Random rd =new Random();
        int percent = rd.nextInt(100);

        System.out.println(" Before Resize ");
        for (int i=0;i<3;i++) {
            array[i].resize(0);
        }
        System.out.println(" After Resize ");
        for (int i=0;i<3;i++) {
            array[i].resize(percent);
        }

    }
}
