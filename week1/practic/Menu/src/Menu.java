import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice = 1;
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Draw Triangle");
            System.out.println("2. Draw Square");
            System.out.println("3. Draw Rectangle");
            System.out.println("0. Exit");
            System.out.println("Please choice Menu");
             choice = sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("1. Draw Triangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * ");
                    System.out.println("* * * ");
                    System.out.println("* * ");
                    System.out.println("* ");
                    break;
                case 2:
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    break;
                case 3:
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice");

            }
        }
    }
}
