package animal;

import animal.Animal;
import  edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "animal.Chicken: tuc tac";
    }


    @Override
    public String howToEat() {
        return "chicken could eat rice";
    }
}
