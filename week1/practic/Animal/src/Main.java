import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal []animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal ani: animals){
            System.out.println(ani.makeSound());
            if (ani instanceof Tiger){
                Edible edie = (Tiger) ani;
                System.out.println(edie.howToEat());
            }
        }
        Fruit []frui = new Fruit[2];
        frui[0] = new Apple();
        frui[1] = new Orange();
        for (Fruit fru:frui){
            System.out.println(fru.howToEat());

        }

    }
}
