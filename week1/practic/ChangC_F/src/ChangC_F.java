import java.util.Scanner;

public class ChangC_F {
    public static  void ShowMenu(){
        Scanner sc = new Scanner(System.in);
        int choice =-1;
        while (choice!=5){
            System.out.println("Menu");
            System.out.println("1. Change C -> F");
            System.out.println("2. Change F -> C");
            System.out.println("0. Exit");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    ChangeC_F();
                    break;
                case 2:
                    ChangeF_C();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("input valid");

            }
        }
    }
    public static  void ChangeC_F(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Độ C cần chuyển sang độ F");
        double Celiuss = sc.nextDouble();
        double F = (9.0 / 5) * Celiuss + 32;
        System.out.println("Độ C sau khi chuyển sang là "+F);
    }
    public  static void ChangeF_C(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Độ F cần chuyển sang độ C");
        double F = sc.nextDouble();
        double Cel = (5.0 / 9) * (F - 32);
        System.out.println("Độ F sau khi chuyển sang độ C là " +Cel);

    }

    public static void main(String[] args) {
        ShowMenu();
    }
}
