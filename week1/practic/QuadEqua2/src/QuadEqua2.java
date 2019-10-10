import java.util.Scanner;

public class QuadEqua2 {
    public static void main(String[] args) {
    float a,b,c;
    Scanner sc =new Scanner(System.in);
        System.out.println("Nhập a=");
        a = sc.nextFloat();
        System.out.println("Nhập b=");
        b = sc.nextFloat();
        System.out.println("Nhập c=");
        c = sc.nextFloat();

        double x;
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("phuong trình vô số nghiệm");
                }else
                    System.out.println("phương trình vô nghiệm");
            }else{
                x = -c/b;
                System.out.println("phương trình có nghiệm"+x);
            }
        }else {
            double delta =Math.pow(b,2) - 4*a*c;
            double x1;
            double x2;
            if (delta<0){
                System.out.println("phương trình vô nghiệm");
            }
            else
                if (delta==0){
                    System.out.println("phuong trinh có nghiệm kép "+ (-b/(2*a)));

                }else{
                    x1 = (-b + Math.sqrt(delta))/(2*a);
                    x2 = (-b - Math.sqrt(delta))/(2*a);
                    System.out.println("phuong trình có  nghiệm x1 =" +x1);
                    System.out.println("phuong trình có  nghiệm x1 =" +x2);


                }

        }



    }
}