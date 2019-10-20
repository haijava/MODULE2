package animal;

import animal.Animal;
import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "tiger :gru gru";
    }

    @Override
    public String howToEat() {
        return "Tiger eat pig";
    }
}
