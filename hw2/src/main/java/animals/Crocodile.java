package animals;

import interfaces.Swim;
import interfaces.Voice;

public class Crocodile extends Carnivore implements Swim, Voice {
    public void swim() {
        System.out.println(this.name + " can swim!");
    }

    public String voice() {
        return "Rrrrr!";
    }

    public Crocodile() {
    }

    public Crocodile(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
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
        return "Crocodile";
    }

    public void addSatiety() {
        this.satiety += 20;
        System.out.println("Satiety for " + this.name + " = " + satiety);
    }
}
