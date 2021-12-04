package animals;

import aviary.AviarySize;
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
        this.size = AviarySize.MEDIUM;
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

    public void addSatiety() {
        this.satiety += 10;
        System.out.println("Satiety for " + this.name + " = " + satiety);
    }
}