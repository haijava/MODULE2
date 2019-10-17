import java.util.Scanner;

public class QuadraticEquation2 {
    private double a, b, c;
    private double delta;

    public QuadraticEquation2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



    public double getRoot1() {
        double r1 = (-b -( Math.sqrt(delta)) )/ (2 * a);
        return r1;
    }
    public double getRoot2(){
       double r2 = (-b +( Math.sqrt(delta)) )/ (2 * a);
        return r2;
    }
    public double getDiscriminant() {
        delta = b * b - 4 * a * c;
        return delta;
    }
    public  void  QuadraticE2(){
        //ax2+bx +c =0
        if (this.a == 0){
            if (b==0)
            {
                System.out.println("vo nghiem");
            }else
            {
                System.out.println("pt cos  nghiem "+(-c/b));
            }
        }else{
            getDiscriminant();
            if (delta==0){
            System.out.println("nghiem kep"+(-b/(2*a)));
        }else if (delta<0){
            System.out.println("vo nghiem");
        }else
            {
                System.out.println("nghiem x1: " +getRoot1());
                System.out.println("nghiem x2: "+getRoot2());
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        double a= sc.nextDouble();
        System.out.println("Nhap b");
        double b =sc.nextDouble();
        System.out.println("Nhap c");
        double c =sc.nextDouble();
        QuadraticEquation2 q2 =new QuadraticEquation2(a,b,c);
        q2.QuadraticE2();

    }

}
