package codegym.hue.hai1;

import java.util.Random;
import java.util.Scanner;

public class SmartWatch {
    private double starTime = System.currentTimeMillis();
    private double endTime =System.currentTimeMillis();

    public SmartWatch( ) {

    }
    public void star(){
        this.starTime =System.currentTimeMillis();
    }
    public void stop(){
        this.endTime =System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.starTime;
    }

    public void creatArr(int array[],int n){

        for(int i =0;i<n;i++){
            Random rd =new Random();
            array[i] =rd.nextInt(n);
        }
    }
    public void showArray(int[]array,int n){
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void hoanvi(int[]array,int a,int b){
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public  void sort(int[]array,int n){

        for (int i=0;i<n-1 ;i++){
            int max =i;
            for (int j= i+1;j<n;j++){
                if (array[max]>array[j]){
                    max = j;
                }
            }
            if (max!=i){
                hoanvi(array, max,i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" input number element Array : ");
        int n =sc.nextInt();
        int[]array = new int[n];

        SmartWatch s1 =new SmartWatch();

        s1.creatArr(array,n);
        System.out.println("Array  just creat");

        s1.showArray(array,n);

        s1.star();
        s1.sort(array,n);
        s1.stop();

        double sa = s1.getElapsedTime();
        System.out.println("the time to sort Array is "+sa);

        System.out.println("Array after sort crease");
        s1.showArray(array,n);
    }


}
