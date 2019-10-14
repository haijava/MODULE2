import java.util.Scanner;

public class findMinArr {
    public static void creatArr(int[]Arr, int n){
        Scanner sc =new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("Nhập phần tủ "+i);
            Arr[i]= sc.nextInt();
        }

    }
    public static void  showArr(int[]Arr,int n){
        for (int i =0; i<n; i++){
            System.out.print(Arr[i]+", ");
        }
        System.out.println();

    }
    public static  int findMin(int[]Arr,int n){
        int min = Arr[0];
        for(int i= 1;i<n;i++){
            if(Arr[i]<min){
                min =Arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Nhập số phần tử mảng");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] Arr = new int[n];
        creatArr(Arr,n);
        System.out.println("Mảng Arr");
        showArr(Arr,n);
        System.out.println("Giá trị nhỏ nhất trong mảng la " +findMin(Arr,n));
    }
}
