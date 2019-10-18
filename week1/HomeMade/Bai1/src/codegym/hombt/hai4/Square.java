package codegym.hombt.hai4;

public class Square {
    private double width;
    public  Square(double width){
        this.width =width;
    }
    public  double Area(){
        return this.width *this.width;
    }
    public  void Draw() {
        for (int i = 0; i < this.width; i++) {
            for (int j=0;j<this.width;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
