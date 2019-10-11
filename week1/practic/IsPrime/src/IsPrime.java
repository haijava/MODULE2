import java.util.Scanner;

public class IsPrime {
    public static void CheckIsPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị cần kiểm tra");
        int n= sc.nextInt();
        if (n<0) System.out.println("n không phải số nguyên tố");
        else if (n==0||n==1){
            System.out.println("không phải số nguyên tố");

        } else {
            boolean flag =true;
            for (int i=2;i<n;i++){
                if (n%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag==true) System.out.println("số nguyên tố");
            else System.out.println("không phải sô nguyên tố");
        }

    }
    public static void main(String[] args) {
        CheckIsPrime();
    }
}
