package animals;

import food.Food;
import food.Meat;
import foodException.WrongFoodException;

public abstract class Carnivore extends Animal {

    public final void eat(Food food) throws WrongFoodException {
        if (!(food instanceof Meat))
            throw new WrongFoodException();
        System.out.println("This animal eat a meat.");
        this.addSatiety();
    }

    public abstract void addSatiety();
}
