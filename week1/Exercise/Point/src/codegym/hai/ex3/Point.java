package codegym.hai.ex3;

public class Point {
    private  float x;
    private  float y;
    private  String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point(float x, float y, String color) {
        this.x = x;
        this.y = y;
        this.color =color;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x =x;
        this.y =y;

    }
    public float[] getXY(){
        float[]array =new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return  array;
    }

    @Override
    public String toString() {
        return " Point " + " x = " + x + " y = " + y + " colo " + color+ "";
    }
}
