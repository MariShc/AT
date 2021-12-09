import animals.*;
import food.Food;
import foodException.WrongFoodException;
import interfaces.Voice;

public class Worker {
    public void feed(Animal animal, Food food) {
        try {
            animal.eat(food);
            System.out.println(animal.getName() + " ate " + food.getName() + ".");
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}
