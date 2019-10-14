import java.util.Random;
import java.util.Scanner;

public class  Arrexample {
    public static  Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for(int i=0;i<100;i++){
            arr[i] =rd.nextInt(100);
            System.out.println(arr[i] +" ");
        }
     return arr;
    }

    public static void main(String[] args) {
        Arrexample arrExample = new Arrexample();
        Integer[] arr = Arrexample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
