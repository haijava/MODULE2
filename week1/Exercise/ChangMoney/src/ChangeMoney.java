import java.util.Scanner;

public class ChangeMoney {
    public  static void ChangeMoney(){
        System.out.println("Nhap so USD cần  đổi");
        Scanner sc = new Scanner(System.in);
        int moneyUsd = sc.nextInt();
        int ChangeUsd =moneyUsd * 23000;
        System.out.println("Tiền việt Nam sau khi đổi từ "+ moneyUsd+" USD Là "+ChangeUsd+" VND");
    }

    public static void main(String[] args) {
        ChangeMoney();
    }
}
