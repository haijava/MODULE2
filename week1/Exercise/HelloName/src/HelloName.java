import java.util.Scanner;

public class HelloName {
    public static void Hello(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        Hello();
    }
}
