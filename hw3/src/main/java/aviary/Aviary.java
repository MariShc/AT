package aviary;

import animals.Animal;

import java.util.HashSet;
import java.util.Objects;

public class Aviary<T extends Animal> {
    private HashSet<T> hashSet = new HashSet<>();
    private AviarySize size;

    public Aviary(AviarySize size) {
        this.size = size;
    }

    private int sizeAnimalInAviary() {
        int count = 0;
        for (Animal animal : hashSet)
            count += animal.getSize().getSize();
        return count;
    }

    public void add(T animal) {
        if (animal.getSize().getSize() + this.sizeAnimalInAviary() <= this.size.getSize())
            hashSet.add(animal);
        else
            System.out.println("Animal " + animal.getName() + " won't fit in the aviary!");
    }

    public void remove(T animal) {
        hashSet.remove(animal);
    }

    public Animal getAnimal(String name) {
        for (Animal animal : hashSet) {
            if (animal.hashCode() == Objects.hash(name))
                return animal;
        }
        return null;
    }

    public void viewAviary() {
        System.out.println("----------------------------");
        for (Animal obj : hashSet) {
            System.out.println(obj.getName() + " " + obj.getWeight()
                    + " " + obj.getAge() + " " + obj.getColor());
        }
        System.out.println("----------------------------");
    }
}
