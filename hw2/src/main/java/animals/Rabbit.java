package animals;

import interfaces.Run;
import interfaces.Swim;
import interfaces.Voice;

public class Rabbit extends Herbivore implements Run, Swim, Voice {

    public Rabbit() {
    }

    public Rabbit(String name, double weight, int age, String color) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.satiety = 10;
    }

    public void run() {
        System.out.println(this.name + " can run!");
    }

    public void swim() {
        System.out.println(this.name + " can swim!");
    }

    public String voice() {
        return "Pipipii!";
    }
}