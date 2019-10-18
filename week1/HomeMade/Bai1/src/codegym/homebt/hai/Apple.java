package codegym.homebt.hai;

public class Apple {
    private double weight;
    public Apple(double weight){
        this.weight = weight;
    }
    public  void decrease(){
        if (this.weight>0){
            this.weight --;
        }
    }
    public boolean isEmpty(){
        if (this.weight==0){
            return true;
        }
        return false;
    }
    public double info(){
        return this.weight;
    }

}
