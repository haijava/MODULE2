import java.util.Scanner;

public class MaxInArr {
    public static void creatArr(int[] Arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử cho mảng" + i);
            Arr[i] = sc.nextInt();
        }

    }

    public static void showArr(int[] Arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + ", ");
        }
    }

    public static int findMax(int[] Arr, int n) {
        int max = Arr[0];
        for (int i = 1; i < n; i++) {
            if (Arr[i] > max) {
                max=Arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tủ mảng");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        creatArr(Arr, n);
        showArr(Arr, n);
        System.out.println("giá trị lớn nhất mảng là " + findMax(Arr, n));
    }
}
