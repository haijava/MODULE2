import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class LeapYear {
    public static void CheckLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm kiểm tra");
        int yearNumber = sc.nextInt();
        if (yearNumber % 4 == 0 && yearNumber % 100 != 0) {
            System.out.println("Năm nhuân");
        } else if (yearNumber % 100 == 0 && yearNumber % 400 != 0) {
            System.out.println("không phải năm nhuận");
        } else if (yearNumber % 100 == 0 && yearNumber % 400 == 0) {
            System.out.println("Năm nhuận");
        }
    }

    public static void main(String[] args) {
        CheckLeapYear();
    }
}
