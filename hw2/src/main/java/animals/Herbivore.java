package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    public final boolean eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("This animal eat a grass.");
            return true;
        } else {
            System.out.println("Herbivore animals don't eat а meat!");
            return false;
        }
    }

    public abstract String getName();

    public abstract double getWeight();

    public abstract int getAge();

    public abstract String getColor();

    public abstract String typeAnimal();

    public abstract void addSatiety();
}
