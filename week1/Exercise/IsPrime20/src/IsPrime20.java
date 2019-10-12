public class IsPrime20 {
    public static  boolean checkIsPrime(int n){
        boolean flag =true;
        if (n<2) flag = false;
        else
            for (int i =2;i<n;i++){
                if (n%i == 0) {
                    flag = false;
                    break;
                }else
                    flag =true;

            }
            return flag;
    }

    public static void main(String[] args) {
        int count =0;
        for (int i=2;count<20;i++){
            if (checkIsPrime(i)){
                count++;
                System.out.print(i+",");
            }
        }
    }
}
