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
        int[]array =new int[n+1];
        for (int i = 0; i<index; i++){
            array[i]= arr[i];
        }
        array[index]=k;
        for (int i= index+1;i<n+1;i++){
            array[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        System.out.println("input number element");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        createArr(arr,n);
        showArr(arr,n);
        System.out.println("input values added");
        int k =sc.nextInt();
        System.out.println("input  position to add");
        int index =sc.nextInt();
        while (index<0 || index>n){
            System.out.println("input again");
            index =sc.nextInt();
        }


        addIndex(arr,k,index,n);

    }
}
