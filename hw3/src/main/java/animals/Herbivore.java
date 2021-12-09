package animals;

import food.Food;
import food.Grass;
import foodException.WrongFoodException;

public abstract class Herbivore extends Animal {

    public final void eat(Food food) throws WrongFoodException {
        if (!(food instanceof Grass))
            throw new WrongFoodException();
        System.out.println("This animal eat a grass.");
        this.addSatiety();
    }
}
