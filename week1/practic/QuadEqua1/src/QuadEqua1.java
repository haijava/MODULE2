import java.util.Scanner;

public class QuadEqua1 {
    public static void main(String[] args) {
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        a = sc.nextDouble();
        System.out.println("Nhâp b");
        b = sc.nextDouble();
        if (a==0){
            if (b==0){
                System.out.println("Phuong trình vô số nghiệm");
            }else
                System.out.println("phương trình vô nghiệm");
        }else{
        x= -b/a;
        System.out.println("phuong trình có nghiệm" +(-b/a));
        }
    }
}
