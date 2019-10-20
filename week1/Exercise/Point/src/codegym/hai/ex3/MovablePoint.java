package codegym.hai.ex3;

public class MovablePoint extends Point {
    private float xSpeed;
    private  float ySpeed;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed,String color) {
        super(x, y,color);
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    public float[] getSpeed(){
        float[]arr =new float[2];
        arr[0] =this.xSpeed;
        arr[1] =this.ySpeed;
        return arr;
    }

    @Override
    public String toString() {
        return " MovablePoint is Subclass of " + super.toString()+" xSpeed " + this.xSpeed + " ySpeed " + this.ySpeed + "";
    }
    public  void  move(){
        float[]arr =super.getXY();
        arr[0] += this.xSpeed;
        arr[1] += this.ySpeed;
        System.out.println(" move " +arr[0] + ", " +arr[1]);

    }
}
