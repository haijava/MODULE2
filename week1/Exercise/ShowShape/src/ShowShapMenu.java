import java.util.Scanner;

public class ShowShapMenu {
    public static void MenuShow() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu show");
            System.out.println("1. Draw rectangle");
            System.out.println("2. Draw top left,right triangles");
            System.out.println("3. Draw botton left,right triangles");
            System.out.println("4. Draw isosceles triangle");
            System.out.println("Please choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    topLefTriangle();
                    break;
                case 3:
                    BottonLefTriangle();
                    break;
            }

        }
    }

    public static void rectangle() {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void topLefTriangle() {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void BottonLefTriangle() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MenuShow();

    }
}
