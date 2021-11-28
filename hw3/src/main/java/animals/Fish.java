package animals;

import aviary.AviarySize;
import interfaces.Swim;

public class Fish extends Herbivore implements Swim {

    public void swim() {
        System.out.println(this.name + " can swim!");
    }

    public Fish() {
    }

    public Fish(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.aviarySize = AviarySize.SMALL;
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
        return "Fish";
    }

    public void addSatiety() {
        this.satiety += 10;
        System.out.println("Satiety for " + this.name + " = " + satiety);
    }
}
