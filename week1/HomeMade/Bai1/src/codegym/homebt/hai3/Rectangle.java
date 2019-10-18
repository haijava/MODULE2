package codegym.homebt.hai3;

public class Rectangle {
    void draw(Shape x) {
        for (int i = 0; i < x.width; i++) {
            for (int j = 0; j < x.height; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public double getAreas(Shape z) {
        return z.width * z.height;
    }


}
