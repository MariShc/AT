package animals;

import interfaces.Swim;

public class Fish extends Herbivore implements Swim {

    public Fish() {
    }

    public Fish(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.satiety = 10;
    }

    public void swim() {
        System.out.println(this.name + " can swim!");
    }
}
