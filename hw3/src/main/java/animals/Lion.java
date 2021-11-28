package animals;

import aviary.AviarySize;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Lion extends Carnivore implements Run, Swim, Voice {
    public void run() {
        System.out.println(this.name + " can run!");
    }

    public void swim() {
        System.out.println(this.name + " can swim!");
    }

    public String voice() {
        return "Roar!";
    }

    public Lion() {
    }

    public Lion(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.aviarySize = AviarySize.EXTRA_LARGE;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String typeAnimal() {
        return "Lion";
    }

    public void addSatiety() {
        this.satiety += 20;
        System.out.println("Satiety for " + this.name + " = " + satiety);
    }
}
