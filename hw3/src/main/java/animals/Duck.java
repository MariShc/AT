package animals;

import aviary.AviarySize;
import interfaces.Fly;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    public void fly() {
        System.out.println(this.name + " can fly!");
    }

    public void run() {
        System.out.println(this.name + " can run!");
    }

    public void swim() {
        System.out.println(this.name + " can swim!");
    }

    public String voice() {
        return "Quack!";
    }

    public Duck() {
    }

    public Duck(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.aviarySize = AviarySize.MEDIUM;
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
        return "Duck";
    }

    public void addSatiety() {
        this.satiety += 10;
        System.out.println("Satiety for " + this.name + " = " + satiety);
    }
}
