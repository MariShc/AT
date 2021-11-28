import animals.*;
import food.Food;
import foodException.WrongFoodException;

public class Worker {
    public void feed(Animal animal, Food food) throws WrongFoodException {
        if (animal.eat(food)) {
            System.out.println(animal.getName() + " ate " + food.getName() + ".");
            animal.addSatiety();
        }
    }

    public void getVoice(Animal animal) {
        switch (animal.typeAnimal()) {
            case "Crocodile":
                System.out.println(new Crocodile().voice());
                break;
            case "Duck":
                System.out.println(new Duck().voice());
                break;
            case "Lion":
                System.out.println(new Lion().voice());
                break;
            case "Rabbit":
                System.out.println(new Rabbit().voice());
                break;
            case "Wolf":
                System.out.println(new Wolf().voice());
                break;
            case "Fish":
                throw new IllegalStateException("Unexpected value: " + animal.typeAnimal() + " - Can't speak!");
        }
    }
}
