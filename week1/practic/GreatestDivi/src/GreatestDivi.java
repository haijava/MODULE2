import java.util.Scanner;

public class GreatestDivi {
    public static  void FindGreatDivi(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số a");
       int  a =sc.nextInt();
        System.out.println("Nhập số b");
        int b =sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0||b==0) System.out.println("không có ước chung lớn nhất ");
        while (a!=b){
            if (a>b) a=a-b;
            else
                b=b-a;
            System.out.println("ucln "+a);
        }
    }
    public static void main(String[] args) {
    FindGreatDivi();
    }
}
