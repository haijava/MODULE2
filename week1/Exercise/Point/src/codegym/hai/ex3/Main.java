package codegym.hai.ex3;

public class Main {
    public static void main(String[] args) {
        MovablePoint sx = new MovablePoint(2,4,6,8,"red");

        System.out.println("movebale " + sx.toString());
        sx.move();
        sx.setXY(4,9);
        sx.move();
        System.out.println("movebale " + sx.toString());

        // Point
        Point poi1 = new Point(2,4, "red");
        System.out.println("Point "+ poi1.toString());
        poi1.setXY(4,7);
        poi1.setColor("xanh");
        System.out.println("Point "+ poi1.toString());


    }
}
