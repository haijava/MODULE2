import java.util.Scanner;

public class Isprime {
    public static boolean checkIsPrime(int n) {
        boolean flag = true;
        if (n < 2) flag = false;
        else
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
                flag = true;
            }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị n");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (checkIsPrime(i))
                System.out.print(i + ",");
        }
    }


}
