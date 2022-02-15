package animal;

import animal.Animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cục tác lá chanh";
    }

    @Override
    public String howToEat() {
        return "Luộc, nướng, quay";
    }
}
