import animals.*;
import food.Grass;
import food.Meat;
import interfaces.Swim;

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

        ArrayList<Swim> pond = new ArrayList<>(Arrays.asList(duck1, duck2, fish1, fish2));
        for (Swim animal : pond)
            animal.swim();
    }
}
