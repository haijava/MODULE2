package codegym.homebt.hai1;

public class SwitchButton {
    private String status;
    private Lamp lam;

    public SwitchButton(String status, Lamp lam) {
        this.status = status;
        this.lam = lam;
    }

    public void switchOn(){
        lam.tunOn();
    }
    public void switchOff(){
        lam.tunOff();
    }

    public static void main(String[] args) {
        Lamp la1 =new Lamp("tat");
        SwitchButton sw1 =new SwitchButton("tat",la1);
        la1.checkLam();
        sw1.switchOn();
        la1.checkLam();
        sw1.switchOff();
        la1.checkLam();

    }
}

