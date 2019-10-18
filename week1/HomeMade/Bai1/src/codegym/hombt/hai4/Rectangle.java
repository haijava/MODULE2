package codegym.hombt.hai4;

public class Rectangle {
    private  double width;
    private double height;
    public  Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public void  Draw(){
        for (int i=0;i<this.width;i++){
            for (int j=0;j<this.height;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public double Area(){
        return  this.width * this.height;
    }
}
