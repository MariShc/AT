package animals;

import interfaces.Fly;
import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    public Duck() {
    }

    public Duck(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.satiety = 10;
    }

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
}
