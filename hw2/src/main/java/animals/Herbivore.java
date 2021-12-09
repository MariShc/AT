package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {

    public final boolean eat(Food food) {
        if (!(food instanceof Grass)) {
            System.out.println("Herbivore animals don't eat а meat!");
            return false;
        }
        System.out.println("This animal eat a grass.");
        this.addSatiety();
        return true;
    }
}
