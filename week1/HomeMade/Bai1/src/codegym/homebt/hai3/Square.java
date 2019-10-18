package codegym.homebt.hai3;

public class Square {

    public int getArea(Shape a){
        return a.width * a.width;
    }
    public void draw(Shape s){
        for (int i=0;i<s.width;i++){
            for (int j =0;j<s.width;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
