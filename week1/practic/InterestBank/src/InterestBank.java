import java.util.Scanner;

public class InterestBank {
    public static void Bank(){
        double money =1.0;
        int month =1;
        double interes_rate =1.0;
        double summoney =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiền gửi");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi tiết kiệm");
        month =sc.nextInt();
        System.out.println("Nhập tiền lãi ngân hàng");
        interes_rate =sc.nextDouble();
        for (int i=0;i<month;i++){
            summoney=money * (interes_rate/100)/12*month;
        }
        System.out.println("tiền lãi "+summoney);
    }

    public static void main(String[] args) {
        Bank();
    }
}
