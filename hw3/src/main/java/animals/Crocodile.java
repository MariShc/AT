package animals;

import aviary.AviarySize;
import interfaces.Swim;
import interfaces.Voice;

public class Crocodile extends Carnivore implements Swim, Voice {

    public Crocodile() {
    }

    public Crocodile(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.size = AviarySize.EXTRA_LARGE;
    }

    public void swim() {
        System.out.println(this.name + " can swim!");
    }

    public String voice() {
        return "Rrrrr!";
    }

    public void addSatiety() {
        this.satiety += 20;
        System.out.println("Satiety for " + this.name + " = " + satiety);
    }
}
