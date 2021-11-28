package animals;

import aviary.AviarySize;
import food.Food;
import food.Meat;
import foodException.WrongFoodException;

public abstract class Carnivore extends Animal {

    public final boolean eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("This animal eat a meat.");
            return true;
        } else throw new WrongFoodException();
    }

    public abstract String getName();

    public abstract double getWeight();

    public abstract int getAge();

    public abstract String getColor();

    public abstract String typeAnimal();

    public abstract void addSatiety();
}
