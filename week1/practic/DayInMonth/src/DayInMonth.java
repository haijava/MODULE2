import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        int month;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tháng để kiểm tra");
        month =sc.nextInt();
        switch (month){
            case 2:
                System.out.println("Tháng 2 có 28 ngày");
                break;
            case 1:
            case 3:
            case 7:
            case 5:
            case 12:
            case 8:
            case 10:
                System.out.println("Tháng "+ month + "có 31 ngày");
                break;
            case 4:
            case 6:
            case 11:
            case 9:
                System.out.println("Tháng " + month + "có 30 ngày");
                break;
            default:
                System.out.println("Please chose another month");
                break;


        }
    }
}
