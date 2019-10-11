import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tháng để kiểm tra");
        int month =sc.nextInt();
        String dayIsMonth;
        switch (month) {
            case 2:
                dayIsMonth = "28";
                break;
            case 1:
            case 3:
            case 7:
            case 5:
            case 12:
            case 8:
            case 10:
                dayIsMonth = "31";
                break;
            case 4:
            case 6:
            case 11:
            case 9:
                dayIsMonth = "30";
                break;
            default:
                dayIsMonth = "";
                break;
        }
        if (dayIsMonth != "") System.out.printf("the month '%d' có '%s' day ! "  ,month,dayIsMonth);
        else System.out.println("invalid");

        }
    }

