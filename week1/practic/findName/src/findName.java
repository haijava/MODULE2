import java.util.Scanner;

public class findName {
    public static void findNames(){
        String[]sinhVien = new String[] {"hai","nam","hung","minh"};
        Scanner sc =new Scanner(System.in);
        System.out.println("input student is find");
        String student = sc.nextLine();
        boolean flag =false ;
        for (int i=0;i<sinhVien.length;i++){
            if (sinhVien[i].equals(student)){
                System.out.println("co sinh vien trong danh sach");
                flag =true;
                break;
            }

        }
        if (!flag) System.out.println("khong co sinh vien");

    }

    public static void main(String[] args) {
        findNames();
    }
}
