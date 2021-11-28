package animals;

import aviary.AviarySize;
import food.Food;
import foodException.WrongFoodException;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected int age;
    protected String color;
    protected int satiety = 0;
    protected AviarySize aviarySize;

    public abstract boolean eat(Food food) throws WrongFoodException;

    public abstract String getName();

    public abstract double getWeight();

    public abstract int getAge();

    public abstract String getColor();

    public abstract String typeAnimal();

    public abstract void addSatiety();

    public AviarySize getAviarySize() {
        return aviarySize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        return this.name == ((Animal) obj).name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
