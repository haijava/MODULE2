package codegym.homebt.hai;

import java.util.Scanner;

public class EvaAdam {
    private double weight ;
    private String name;
    private String gender;

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public EvaAdam(){

    }
    public  EvaAdam(double weight, String name, String gender){
        this.weight = weight;
        this.name = name;
        this.gender = gender;
    }


    public void  eatApple(Apple a){
    if (!a.isEmpty()){
        this.weight ++;
        a.decrease();

    }
    }
    public  double info(){
        return  this.weight;
    }
    public void  say(String str){
        System.out.println(name +" say "+str);
    }

    @Override
    public String toString() {
        return "EvaAdam{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EvaAdam eva = new EvaAdam(60,"evaaa","nu");
        EvaAdam adam = new EvaAdam(50,"adam","nam");
        String er = eva.getName();
        System.out.println(er);
        Apple ap = new Apple(20);
        eva.eatApple(ap);

        System.out.println(eva);
        System.out.println(adam);

          eva.say("hello");
          adam.say("eeee");
    }
}
