import animals.*;
import aviary.Aviary;
import aviary.AviarySize;

public class Zoo {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Donald Duck", 10, 9, "White");
        Duck duck2 = new Duck("Della Duck", 8, 8, "White");
        Lion lion = new Lion("Lion King", 70, 10, "Ginger");
        Fish fish1 = new Fish("Flounder", 3, 30, "Yellow");
        Fish fish2 = new Fish("Gold Fish", 2, 50, "Gold");
        Crocodile crocodile = new Crocodile("Crocodile Gena", 60.2, 20, "Green");

        Aviary<Herbivore> herbivoreAviary = new Aviary<>(AviarySize.MEDIUM);
        Aviary<Carnivore> carnivoreAviary = new Aviary<>(AviarySize.EXTRA_LARGE);

        herbivoreAviary.add(fish1);
        herbivoreAviary.add(fish2);

        carnivoreAviary.add(crocodile);
        carnivoreAviary.add(lion);

        System.out.println();
        System.out.println("Get a link to animal fish1 by its name:");
        System.out.println(herbivoreAviary.getAnimal("Flounder"));
        System.out.println();

        System.out.println("Herbivore aviary:");
        herbivoreAviary.viewAviary();
        System.out.println();
        System.out.println("Carnivore aviary:");
        carnivoreAviary.viewAviary();
    }
}
