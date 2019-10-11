import java.util.Scanner;

public class BmiBody {
    public static void Bmibody() {
        Scanner sc = new Scanner(System.in);
        double bmi;
        System.out.println("Nhập Cân Nặng");
        double weight = sc.nextDouble();
        System.out.println("Nhập Chiều cao");
        double height = sc.nextDouble();
        bmi = weight / (height * height);
        if (bmi < 18.5) System.out.println("Unweight");
        else if (bmi < 25.0) System.out.println("normal");
        else if (bmi < 30) System.out.println("OverWeight");
        else if (bmi > 30) System.out.println("Obsen");
    }

    public static void main(String[] args) {
        Bmibody();
    }
}
