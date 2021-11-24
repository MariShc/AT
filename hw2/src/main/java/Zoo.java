import animals.*;
import food.Grass;
import food.Meat;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Donald Duck", 10, 9, "White");
        Duck duck2 = new Duck("Della Duck", 8, 8, "White");
        Lion lion = new Lion("Lion King", 70, 10, "Ginger");
        Fish fish1 = new Fish("Flounder", 3, 30, "Yellow");
        Fish fish2 = new Fish("Gold fish", 2, 50, "Gold");
        Crocodile crocodile = new Crocodile("Crocodile Gena", 60.2, 20, "Green");

        Worker worker = new Worker();

        Grass grass = new Grass("plantain");
        Meat meat = new Meat("beef");

        worker.feed(lion, grass);
        worker.feed(lion, meat);
        worker.feed(lion, meat);
        worker.feed(fish1, meat);
        worker.feed(fish1, grass);
        worker.getVoice(crocodile);
        worker.getVoice(lion);
        //worker.getVoice(fish1);

        ArrayList<Animal> pond = new ArrayList<Animal>(Arrays.asList(duck1, duck2, fish1, fish2));
        for (Animal animal : pond) {
            switch (animal.typeAnimal()) {
                case "Crocodile":
                    new Crocodile(animal.getName(), animal.getWeight(),
                            animal.getAge(), animal.getColor()).swim();
                    break;
                case "Duck":
                    new Duck(animal.getName(), animal.getWeight(),
                            animal.getAge(), animal.getColor()).swim();
                    break;
                case "Lion":
                    new Lion(animal.getName(), animal.getWeight(),
                            animal.getAge(), animal.getColor()).swim();
                    break;
                case "Rabbit":
                    new Rabbit(animal.getName(), animal.getWeight(),
                            animal.getAge(), animal.getColor()).swim();
                    break;
                case "Wolf":
                    new Wolf(animal.getName(), animal.getWeight(),
                            animal.getAge(), animal.getColor()).swim();
                    break;
                case "Fish":
                    new Fish(animal.getName(), animal.getWeight(),
                            animal.getAge(), animal.getColor()).swim();
                    break;
            }
        }
    }
}
