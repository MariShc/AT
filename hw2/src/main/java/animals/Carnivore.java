package animals;

import food.Food;
import food.Meat;

public abstract class Carnivore extends Animal {

    public final boolean eat(Food food) {
        if (!(food instanceof Meat)) {
            System.out.println("Carnivore animals don't eat а grass!");
            return false;
        }
        System.out.println("This animal eat a meat.");
        this.addSatiety();
        return true;
    }
}
