import java.util.Random;
import java.util.Scanner;

public class FindMax2 {
    public static void createRandomArr(int[][]Arr, int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arr[i][j] = rd.nextInt(n);
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static  int findMax(int[][]Arr,int n){
        int max = Arr[0][0];
        int vt1 =0;
        int vt2 =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (Arr[i][j]>max){
                    max =Arr[i][j];
                    vt1 = i;
                    vt2 = j;
                }

            }

        }

        System.out.println("vi tri max co vi tri hang " + vt1);
        System.out.println("vi tri max co vi tri cot " + vt2);
        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so phan tu mang");
        int n =sc.nextInt();
        int[][]Arr = new int[n][n];
        createRandomArr(Arr,n);
        System.out.println("gias trij max cua mang hai chieu "+findMax(Arr,n));
    }
}
