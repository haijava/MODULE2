package codegym.homebt.hai1;

public class Lamp {
    private String status;
    public Lamp(String status){
        this.status = status;
    }
    public  void tunOff(){
        this.status ="tat";

    }
    public void tunOn(){
        this.status ="on";
    }
    public  void checkLam(){
        System.out.println(status);
    }

}
