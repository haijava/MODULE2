import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class addIndexArr {
    public  static  void createArr(int[] arr, int n){
        Scanner sc =new Scanner(System.in);
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static  void showArr(int[]arr,int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void addIndex(int[]arr,int k,int index,int n) {

        if (index < 0 && index >= n - 1) {
            System.out.println("khong add dc");

        } else {
            int j ;
            for (j = arr.length-2; j > index; j--) {
                arr[j + 1] = arr[j];
            }
            arr[index] = k;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        System.out.println("input number element");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        createArr(arr,n);
        showArr(arr,n);
        System.out.println("nhap gia tri can chen");
        int k =sc.nextInt();
        System.out.println("nhaapj vij tri can chen");
        int index =sc.nextInt();
        addIndex(arr,k,index,n);

    }
}
