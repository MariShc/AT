import animals.*;
import food.Food;
import interfaces.Voice;

public class Worker {
    public void feed(Animal animal, Food food) {
        if (animal.eat(food))
            System.out.println(animal.getName() + " ate " + food.getName() + ".");
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.voice());
    }
}
