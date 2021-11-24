package animals;

import food.Food;
import food.Meat;

public abstract class Carnivore extends Animal {

    public final boolean eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("This animal eat a meat.");
            return true;
        } else {
            System.out.println("Carnivore animals don't eat а grass!");
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
