package codegym.hai.oop;

public class Fan {
    public static final int SLOW =1;
    public static final  int MEDIUM =2;
    public static final int FAST =3;
    private int Speed = SLOW;
    boolean on = false;
    private  double radius = 5;
    private String colo ="blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
        
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
        this.colo = colo;
    }

    public Fan() {

    }

    @Override
    public String toString() {
        return "Fan{" +
                "Speed=" + Speed +
                ", on=" + on +
                ", radius=" + radius +
                ", colo='" + colo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        System.out.println(""+f1.toString());
        f2.setOn(true);
        f2.toString();
        f2.setColo("red");
        f2.setSpeed(MEDIUM);

        System.out.println(""+f2.toString());
    }
}
