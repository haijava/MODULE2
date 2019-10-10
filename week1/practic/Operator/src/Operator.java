import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float widths;
        float height;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        widths = scanner.nextFloat();
        System.out.println("Nhập chiêu cao");
        height =scanner.nextFloat();
        float area = widths * height;
        System.out.println("Area is "+area);
    }
}
