package animals;

import aviary.AviarySize;
import food.Food;
import food.Grass;
import foodException.WrongFoodException;

public abstract class Herbivore extends Animal {

    public final boolean eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("This animal eat a grass.");
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
