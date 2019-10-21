package module2.java.practic.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comparable[]array = new Comparable[3];
        array[0] = new ComparableCircle(3,"red",true);
        array[1] = new ComparableCircle(2,"blue",false);
        array[2] = new ComparableCircle(5,"yellow",true);

        for (Comparable arr:array){
            System.out.println(arr.toString());
        }

        Arrays.sort(array);
        System.out.println("Array after sort");
        for (Comparable arr:array){
            System.out.println(arr.toString());
        }
    }
}
